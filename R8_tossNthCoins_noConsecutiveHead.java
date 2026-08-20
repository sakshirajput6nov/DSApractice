package Recursion;

public class R8_tossNthCoins_noConsecutiveHead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tossCoin(3,"");
	}

	public static void tossCoin(int i, String s) {
		if(i==0) {
			System.out.print(s+" ");
			return;
		}
		if(s.length()==0||s.charAt(s.length()-1)!='H') {
		tossCoin(i-1,s+"H");}
		tossCoin(i-1,s+"T");
	}
//HTH HTT THT TTH TTT 
}
