package javaclasspack;
import java.util.*;
public class gcd {
// gcd lcm of a number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int temp1=n1;
		int temp2=n2;
		
		int val=1;
 //euclidean division 
		while(n1>0 && n2>0) {
			if(n1<n2) {
				n2=n2%n1;
			}
			else {
				n1=n1%n2;
			}
		}
		if(n2==0) {
			System.out.println(n1);
			val=n1;
		}
		else {
			val=n2;
			System.out.println(n2);
			
		}
		int lcm=(temp1*temp2)/val;
		System.out.println("lcm : "+lcm);
		
// for loop 
//		int maxi=Integer.MIN_VALUE;
//		for(int i=1;i<=mini;i++) {
//			if(n2%i==0 && n1%i==0) {
//				if(i>maxi) {
//					maxi=i;
//				}
//			}
//		}
//		System.out.println(maxi);
//       
//	}
		
		//while loop 
//		int i=1;
//		while(i<=mini) {
//			if(n2%i==0 && n1%i==0) {
//				if(i>maxi) {
//					maxi=i;
//				}
//			}
//			i++;
//		}
//		System.out.println(maxi);
	
		
// basic gcd method divide divident by divisor them rem divide divisor till come rem 0		
//		int a,b;
//		if(n1<n2) {
//			 a=n2;
//			 b=n1;
//		}
//		else {
//			 a=n1;
//			 b=n2;
//		}
//		while(a%b!=0) {
//			int rem=a%b;
//			a=b;
//			b=rem;
//			
//		}
//		System.out.println(b);
		
// lcm of no. 
		
		
}}
