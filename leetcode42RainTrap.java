package monu;


import java.util.Scanner;

public class leetcode42RainTrap {

    public int trap(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        int sum = 0;

        int[] l = new int[n];
        int[] r = new int[n];

        // Left maximum array
        l[0] = arr[0];
        for (int i = 1; i < n; i++) {
            l[i] = Math.max(arr[i], l[i - 1]);
        }

        // Right maximum array
        r[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            r[i] = Math.max(arr[i], r[i + 1]);
        }

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            sum += Math.min(l[i], r[i]) - arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create object and call method
        leetcode42RainTrap obj = new leetcode42RainTrap();
        int result = obj.trap(arr);

        System.out.println("Total trapped water = " + result);

        sc.close();
    }
}
