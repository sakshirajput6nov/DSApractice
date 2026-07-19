package monu;

public class firstBadVersion {

    // Parent class
    static class VersionControl {
        // Suppose version 4 is the first bad version
        int firstBad = 4;

        boolean isBadVersion(int version) {
            return version >= firstBad;
        }
    }

    // Solution class
    static class Solution extends VersionControl {

        public int firstBadVersion(int n) {
            int s = 1;
            int e = n;
            int ans = 0;

            while (s <= e) {
                int m = s + (e - s) / 2;

                if (isBadVersion(m)) {
                    ans = m;
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int n = 5;
        System.out.println("First Bad Version: " + obj.firstBadVersion(n));
    }
}