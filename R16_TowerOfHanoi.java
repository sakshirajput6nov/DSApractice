package Recursion;

public class R16_TowerOfHanoi {

	public static void main(String[] args) {
		TOH(3,"A","B","C");
		// source , destination, helper

	}

	private static void TOH(int n, String S, String H, String D) {
		if(n==0) {
			return;
		}
		TOH(n-1,S,D,H);
		System.out.println("disc "+n+" move from "+S+" to "+D);
		TOH(n-1,H,S,D);
		
		
	}

}
