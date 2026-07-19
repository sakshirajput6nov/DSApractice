package monu;

import java.util.Scanner;

public class searchMatrix240 {

    // Function to search the target in the matrix
    public static boolean searchMatrix(int[][] arr, int target) {

        // Start from the top-right corner
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {

            if (arr[row][col] == target) {
                return true; // Target found
            }

            // Current element is greater than target
            else if (arr[row][col] > target) {
                col--; // Move left
            }

            // Current element is smaller than target
            else {
                row++; // Move down
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        if (searchMatrix(arr, target)) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }

        sc.close();
    }
}