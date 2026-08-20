package Recursion;

public class R14_Leetcode17_letterCombinationOfPhoneNo {
	static String[]code= {"","","abc","def","ghi","jkl","mno","pqr","stuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone("23","");
	}
	private static void Phone(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		String s=code[ch-48];//abc 
		for(int i=0;i<s.length();i++) {
			Phone(ques.substring(1),ans+s.charAt(i));
		}
		
		
	}

}
//ad 
//ae 
//af 
//bd 
//be 
//bf 
//cd 
//ce 
//cf