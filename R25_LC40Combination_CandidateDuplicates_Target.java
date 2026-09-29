package Recursion;

import java.util.*;

public class R25_LC40Combination_CandidateDuplicates_Target {

    public static void main(String[] args) {

        int[] coins = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        System.out.println(combinationSum2(coins, target));
    }

    public static List<List<Integer>> combinationSum2(int[] coins, int target) {

        Arrays.sort(coins);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(coins, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    public static void backtrack(int[] coins, int target,
                                 int start,
                                 List<Integer> list,
                                 List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < coins.length; i++) {

            // Skip duplicate elements at the same level
            if (i > start && coins[i] == coins[i - 1]) {
                continue;
            }

            // Array is sorted, so further elements will also be greater
            if (coins[i] > target) {
                break;
            }

            list.add(coins[i]);

            // i + 1 → every element can be used only once
            backtrack(coins, target - coins[i],
                      i + 1, list, ans);

            // Backtracking
            list.remove(list.size() - 1);
        }
    }
}
//[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
