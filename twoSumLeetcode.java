package monu;

import java.util.Arrays;

public class twoSumLeetcode {

    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int val = target - arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (val == arr[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        twoSumLeetcode obj = new twoSumLeetcode();

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}