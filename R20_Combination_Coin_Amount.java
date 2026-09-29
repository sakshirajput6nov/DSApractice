package Recursion;

public class R20_Combination_Coin_Amount {

		public static void main(String[] args) {
			int amount=6;
			String ans="";
			int[]coins= {2,1,5,10};
			permu(coins,amount,ans,0);
			
		}
		private static void permu(int[] coins, int amount, String ans,int idx) {
			if(amount==0) {
				System.out.println(ans);
				return;
			}
			for(int i=idx;i<coins.length;i++) {
				if(coins[i]<=amount) {
					amount-=coins[i];
					permu(coins,amount,ans+coins[i],i);
					amount+=coins[i];
				}
			}
		}

	}
//222
//2211
//21111
//111111
//15


//Combination without explicit backtracking
//package Recursion;
//
//public class R20_Combination_Coin_Amount {
//
//		public static void main(String[] args) {
//			int amount=6;
//			String ans="";
//			int[]coins= {2,1,5,10};
//			permu(coins,amount,ans,0);
//			
//		}
//		private static void permu(int[] coins, int amount, String ans,int idx) {
//			if(amount==0) {
//				System.out.println(ans);
//				return;
//			}
//			for(int i=idx;i<coins.length;i++) {
//				if(coins[i]<=amount) {
//					
//					permu(coins,amount-coins[i],ans+coins[i],i);
//					
//				}
//			}
//		}
//
//	}
