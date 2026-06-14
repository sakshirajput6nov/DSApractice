package javaclasspack;
import java.util.*;
public class sum_of_digits {
// sum , reverse , palindrome,count
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=(int) Math.floor(Math.log10(n)+1);
		int ans=0;
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum+=r;
			//ans=ans*10+r; //reverse a no.
			n/=10;
		}
		System.out.println(sum+" "+c);
	}

}
