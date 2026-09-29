package Recursion;
// permutation
public class R19_Permutation_coin_Amount {

	public static void main(String[] args) {
		int amount=6;
		String ans="";
		int[]coins= {2,1,5,10};
		permu(coins,amount,ans);
		

	}

	private static void permu(int[] coins, int amount, String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<coins.length;i++) {
			if(coins[i]<=amount) {
				amount-=coins[i];
				permu(coins,amount,ans+coins[i]);
				amount+=coins[i];
			}
		}
	}

}
//222
//2211
//2121
//2112
//21111
//1221
//1212
//12111
//1122
//11211
//11121
//11112
//111111
//15
//51


//package Recursion;

//Permutation without explicit backtracking
//public class R19_Permutation_coin_Amount {
//
// public static void main(String[] args) {
//
//     int amount = 6;
//     String ans = "";
//
//     int[] coins = {2, 1, 5, 10};
//
//     permu(coins, amount, ans);
// }
//
// private static void permu(int[] coins, int amount, String ans) {
//
//     if (amount == 0) {
//         System.out.println(ans);
//         return;
//     }
//
//     for (int i = 0; i < coins.length; i++) {
//
//         if (coins[i] <= amount) {
//
//             permu(coins,
//                   amount - coins[i],
//                   ans + coins[i]);
//         }
//     }
// }
//}