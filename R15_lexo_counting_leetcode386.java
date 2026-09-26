package Recursion;

public class R15_lexo_counting_leetcode386 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCounting(0,1000);
	}

	private static void printCounting(int cur, int n) {
		if(cur>n) {
			return;
		}
		System.out.println(cur);
		int i=0;
		if(cur==0) {
			i=1;
		}
		for(;i<=9;i++) {
			printCounting(cur*10+i,n);
		}
		
	}

}
