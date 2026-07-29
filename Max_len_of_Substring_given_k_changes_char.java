package monu;

public class Max_len_of_Substring_given_k_changes_char {

    // Function to find longest substring by converting other characters to ch
    public static int longest(String st, int k, char ch) {

        int s = 0, e = 0, ans = 0, flip = 0;

        while (e < st.length()) {

            // Count characters that need to be changed
            if (st.charAt(e) != ch) {
                flip++;
            }

            // Shrink window if changes exceed k
            while (flip > k) {
                if (st.charAt(s) != ch) {
                    flip--;
                }
                s++;
            }

            // Update answer
            ans = Math.max(ans, e - s + 1);
            e++;
        }

        return ans;
    }

    public static void main(String[] args) {

        String st = "abbbaab";
        int k = 2;

        // Change b -> a
        int ans1 = longest(st, k, 'a');

        // Change a -> b
        int ans2 = longest(st, k, 'b');

        // Final Answer
        System.out.println("Longest Length = " + Math.max(ans1, ans2));
    }
}