package Recursion;
import java.util.List;
import java.util.ArrayList;
public class R22_permutation_nestedList_coinAmount_Leetcode39Medium {




// printing in 2 D list 
	public static void main(String[] args) {
		List<Integer>ans=new ArrayList<>();
		List<List<Integer>>fl=new ArrayList<>();
		int[]coins= {2,1,5,10};
		Permutation(coins,6,ans,0,fl);
		System.out.println(fl);
	}

	private static void Permutation(int[]coins, int amt,List<Integer> ans, int idx,List<List<Integer>> finalList) {
		if(amt==0) {
//			finalList.add(ans);
//			[[], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
			finalList.add(new ArrayList<Integer>(ans));// ans wali list ko copy kr k new list m daal diya or usko add kr diya 
//			[[2, 2, 2], [2, 2, 1, 1], [2, 1, 2, 1], [2, 1, 1, 2], [2, 1, 1, 1, 1], [1, 2, 2, 1], [1, 2, 1, 2], [1, 2, 1, 1, 1], [1, 1, 2, 2], [1, 1, 2, 1, 1], [1, 1, 1, 2, 1], [1, 1, 1, 1, 2], [1, 1, 1, 1, 1, 1], [1, 5], [5, 1]]
			return;
		}
		for(int i=idx;i<coins.length;i++) {
			if(coins[i]<=amt) {
				ans.add(coins[i]);
				Permutation(coins,amt-coins[i],ans,0,finalList);
				ans.remove(ans.size()-1);
			}
		}
		
	}

}
////leetcode 39 
//class Solution {
//    public List<List<Integer>> combinationSum(int[] coins, int amt) {
//        List<Integer>ans=new ArrayList<>();
//        List<List<Integer>>fl=new ArrayList<>();
//        helper(coins,amt,ans,0,fl);
//        return fl;
//    }
//    	public static void helper(int[]coins, int amt,List<Integer> ans, int idx,List<List<Integer>> finalList) {
//		if(amt==0) {
//			finalList.add(new ArrayList<Integer>(ans));// ans wali list ko copy kr k new list m daal diya or usko add kr diya 
//
//			return;
//		}
//		for(int i=idx;i<coins.length;i++) {
//			if(coins[i]<=amt) {
//				ans.add(coins[i]);
//				helper(coins,amt-coins[i],ans,i,finalList);
//				ans.remove(ans.size()-1);
//			}
//		}
//		
//	}
//
//
//}