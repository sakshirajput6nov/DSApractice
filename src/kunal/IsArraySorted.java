package kunal;

public class IsArraySorted {
	public static void main(String[]args) {
		int[]arr= {1,2,6,7};
		System.out.println(sorted(arr));
	}
	static boolean sorted(int []arr) {
		return helper(arr,0);
	}
	static boolean helper(int []arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		if(arr[index]<arr[index+1]) {
			return helper(arr,index +1);
		}
		return false;
	} 

}
