package Recursion;

public class R5_fibonacci_series_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(5));
	}
	static int fibo(int n) {
		if(n==0 ||n==1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
}
