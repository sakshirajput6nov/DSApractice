package Recursion;

public class R7_tossNthCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tossCoin(3,"");
	}

	public static void tossCoin(int i, String s) {
		if(i==0) {
			System.out.print(s+" ");
			return;
		}
		tossCoin(i-1,s+"H");
		tossCoin(i-1,s+"T");
	}

}
