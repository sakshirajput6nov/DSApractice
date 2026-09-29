package Recursion;

import java.util.*;

public class R24_combination_LC216_sumN_1to9usedNumbers {

    public static void main(String[] args) {

        int size = 3;
        int n = 7;

        System.out.println(combinationSum3(size, n));
    }

    public static List<List<Integer>> combinationSum3(int size, int n) {

        List<List<Integer>> fl = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        int sum = 0;

        helper(n, size, sum, l, fl, 0);

        return fl;
    }

    public static void helper(int n, int size, int sum,
                              List<Integer> l,
                              List<List<Integer>> fl,
                              int idx) {

        if (sum == n && size == l.size()) {
            fl.add(new ArrayList<>(l));
            return;
        }

        if (sum > n || size < l.size()) {
            return;
        }

        for (int i = idx + 1; i <= 9; i++) {

            l.add(i);

            helper(n, size, sum + i, l, fl, i);

            l.remove(l.size() - 1);
        }
    }
}
//[[1, 2, 4]]