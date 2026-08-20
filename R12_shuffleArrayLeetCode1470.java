package Recursion;
// mistake in it 
import java.util.Arrays;

public class R12_shuffleArrayLeetCode1470 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int []narr=new int[arr.length];
		int n=5;
		for(int i=0;i<narr.length-1;i++) {
			narr[i++]=arr[i];
			narr[i]=arr[n+i];
		}
		System.out.println(Arrays.toString(narr));
	}

}
