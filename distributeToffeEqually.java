package monu;

public class distributeToffeEqually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=4;//student
		int t=14;//toffee
		int rem=t%s;
		System.out.println(Math.min(rem,t-rem));
	}

}
