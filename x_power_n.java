package Recursion;

public class x_power_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power(5,3));
	}
	public static int Power(int x,int n) {
		if(n==1) {
			return x;
		}
		return x*Power(x,n-1);
	}

}
