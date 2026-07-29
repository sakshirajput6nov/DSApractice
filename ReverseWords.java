package monu;

public class ReverseWords {

    public static String reverseWords(String st) {

        String[] arr = st.trim().split("\\s+");

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            String temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        return String.join(" ", arr);
    }

    public static void main(String[] args) {

        String st = "  hello   world  ";

        System.out.println("Original String : \"" + st + "\"");
        System.out.println("Reversed String : \"" + reverseWords(st) + "\"");
    }
}
