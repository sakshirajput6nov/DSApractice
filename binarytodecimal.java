package monu;
import java.util.*;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int mul=1;
		while(n!=0) {
			int r=n%2;
			ans=ans+r*mul;
			mul*=10;
			n/=2;
		}
		System.out.println(ans);
	}

}
