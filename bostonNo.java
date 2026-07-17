package monu;
import java.util.*;
public class bostonNo {
	static int sum(int n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int value=n;
		int sumdigit=sum(n);
		int sumfactor=0;
		boolean isComposite=false;
		for(int i=2;i*i<=n;i++) {
			while(n%i==0) {
				isComposite=true;
				sumfactor+=sum(i);
				n=n/i;
				
			}
		}
		if(n>1) {
			sumfactor+=sum(n);
		}
		if(isComposite && sumfactor==sumdigit) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		
	}

}
