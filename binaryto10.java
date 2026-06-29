package monu;
import java.util.*;
import java.util.Scanner;

public class binaryto10 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int val=0;
//		int c=(int)Math.floor(Math.log10(n)+1);
//		int i=0;
//		while(n!=0) {
//			int rem=n%10;
//			val=(int) val+(int) (rem * Math.pow(2,i));
//			n/=10;
//			i++;
//		}
//		System.out.println(val);
		//
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int mul=1;
		while(n!=0) {
			int r=n%10;
			ans=ans+r*mul;
			mul*=2;
			n/=10;
		}
		System.out.println(ans);
	}
	
}
