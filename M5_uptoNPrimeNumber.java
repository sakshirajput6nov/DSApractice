package monu1;
// tc =O(n^(3/2))
public class M5_uptoNPrimeNumber {

	public static void main(String[] args) {
		int n=100;
		call(n);

	}

	private static void call(int n) {
		for(int i=2;i<=n;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean checkPrime(int i) {
		boolean result=true;
		for(int j=2;j*j<=i;j++) {
//		for(int j=2;j<=i;j++) {	// tc =O(n^2)
			if(i%j==0) {
				result =false;
				return result;
			}
		}
		return true;
		
	}

}
