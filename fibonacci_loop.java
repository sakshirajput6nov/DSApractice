package javaclasspack;
import java.util.*;
public class fibonacci_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		//int temp=06;  //for n th element 6 th no. is 8 
		for(int i=0;i<=n;i++) {
			System.out.println(a);
			int c=a+b;
			//temp=a;
			a=b;
			b=c;
			
		}
		//System.out.println(temp);

	}

}
