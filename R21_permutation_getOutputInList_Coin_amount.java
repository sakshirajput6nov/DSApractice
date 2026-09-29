package Recursion;
import java.util.List;
import java.util.ArrayList;
public class R21_permutation_getOutputInList_Coin_amount {
// printing in 1 D list 
	public static void main(String[] args) {
		List<Integer>ans=new ArrayList<>();
		int[]coins= {2,1,5,10};
		Permutation(coins,6,ans,0);
	}

	private static void Permutation(int[]coins, int amt,List<Integer> ans, int idx) {
		if(amt==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coins.length;i++) {
			if(coins[i]<=amt) {
				ans.add(coins[i]);
				Permutation(coins,amt-coins[i],ans,0);
				ans.remove(ans.size()-1);
			}
		}
		
	}

}
//[2, 2, 2]
//[2, 2, 1, 1]
//[2, 1, 2, 1]
//[2, 1, 1, 2]
//[2, 1, 1, 1, 1]
//[1, 2, 2, 1]
//[1, 2, 1, 2]
//[1, 2, 1, 1, 1]
//[1, 1, 2, 2]
//[1, 1, 2, 1, 1]
//[1, 1, 1, 2, 1]
//[1, 1, 1, 1, 2]
//[1, 1, 1, 1, 1, 1]
//[1, 5]
//[5, 1]