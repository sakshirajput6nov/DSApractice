package Recursion;

public class R6_subsequence_String {

	public static void main(String[] args) {
// 1st way		
//		subsequence("abc","");
// 2nd way		
		System.out.println(Subsequence("abc",""));
	}
//	static int count=0;
//	public static void subsequence(String ques, String ans) {
//		if(ques.length()==0) {
//			System.out.print(ans+" ");
//			count++;
//			return;
//		}
//		char ch=ques.charAt(0);
//		subsequence(ques.substring(1),ans);
//		subsequence(ques.substring(1),ans+ch);
//	}
	public static int Subsequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch=ques.charAt(0);
		int a1=Subsequence(ques.substring(1),ans);
		int b1=Subsequence(ques.substring(1),ans+ch);
		return a1+b1;
	}

}
//output:  c b bc a ac ab abc 