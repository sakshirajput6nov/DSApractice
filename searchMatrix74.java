package monu;


import java.util.Scanner;

public class searchMatrix74 {

    public static boolean searchMatrix(int[][] arr, int target) {

        int col = arr[0].length;
        int i = 0;

        while (i < arr.length) {

            if (arr[i][col - 1] >= target) {
                break;
            } else {
                i++;
            }
        }

        if (i == arr.length) {
            return false;
        } else {

            for (int k = arr[0].length - 1; k >= 0; k--) {
                if (target == arr[i][k]) {
                    return true;
                }
            }

            return false;
        }
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

        boolean ans = searchMatrix(arr, target);

        if (ans) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }

        sc.close();
    }
}
