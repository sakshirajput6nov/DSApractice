package kunal;

public class findLastIndexOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,131,14,2,131,4};
		int target=31;
		System.out.println(findLastIndex(arr,target,arr.length-1));
		

	}
	static int findLastIndex(int[]arr,int target,int index) {
		if(index==-1) {
			return -1;
		}
		if(target==arr[index]) {
			return index;
		}
		return findLastIndex(arr,target,index-1);
		
	}


}
