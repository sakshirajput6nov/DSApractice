package Recursion;

public class Tail_recursion_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5,1));// here 1 more actual parameter
	}
	
	public static int fact(int n,int ans) {
		if(n==0) {
			return ans;//here change 
		}
		return fact(n-1,ans*n);// here ans*n
	}

}
