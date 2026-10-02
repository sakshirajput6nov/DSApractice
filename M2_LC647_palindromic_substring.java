package monu1;

// O(n^3)
public class M2_LC647_palindromic_substring {

	public static void main(String[] args) {
		
		String s = "aaa";
		
		int ans = countSubstrings(s);
		
		System.out.println(ans);
	}

	public static int countSubstrings(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String str = s.substring(i, j + 1);

				if (isPalindrome(str)) {
					count++;
				}
			}
		}

		return count;
	}

	public static boolean isPalindrome(String str) {
		int st = 0;
		int e = str.length() - 1;

		while (st < e) {
			if (str.charAt(st) != str.charAt(e)) {
				return false;
			}

			st++;
			e--;
		}

		return true;
	}
//	6
}