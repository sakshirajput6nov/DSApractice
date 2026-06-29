package monu;

public class max_elementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {100,2,30,4,5};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
