package monu1;
import java.util.Arrays;
public class M6_uptoNPrimeNumberBestOptimized {

	public static void main(String[] args) {
		nPrime(100);

	}

	private static void nPrime(int n) {
		boolean[]arr=new boolean[n+1];
		Arrays.fill(arr, true);// let all no. be prime no. 
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i*i<arr.length;i++) {
			if(arr[i]) {
				for(int j=i*i;j<=arr.length;j++) {
					if(j%i==0) {
						arr[j]=false;
					}
				}
//				for(int j=2;j*i<arr.length;j++) {// hard to understand 
//					arr[i*j]=false;
//				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]) {
				System.out.println(i+" ");
			}
		}
		
	}

}
