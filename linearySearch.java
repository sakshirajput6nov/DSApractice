package monu;

public class linearySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5};
		int target=5;
		int r=linearSearch(arr,target);
		System.out.println(r);
	}
	public static int linearSearch(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				
				return i;
			}
		}
		return -1;
	}
	

}
