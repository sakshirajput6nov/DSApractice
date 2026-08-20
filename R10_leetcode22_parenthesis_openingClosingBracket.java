package Recursion;

public class R10_leetcode22_parenthesis_openingClosingBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parenthesis(3,0,0,"");
	}

	private static void Parenthesis(int n, int open, int close, String s) {
		if(open==n && close==n) {
			System.out.print(s+" ");
			return;
		}
		if(open<n) {
			Parenthesis(n,open+1,close,s+"(");
		}
		if(close<open) {
			Parenthesis(n,open,close+1,s+")");
		}
		
	}

}
//((())) (()()) (())() ()(()) ()()()
