package kunal;

public class findIndexOfElement {

	public static void main(String[] args) {
		int a=9;
		// TODO Auto-generated method stub
		int[]arr= {12,1311,14,2,31,4};
		int target=131;
		System.out.println(findIndex(arr,target,0));
		

	}
	static int findIndex(int[]arr,int target,int index) {
		if(arr.length==index) {
			return -1;
		}
		if(target==arr[index]) {
			return index;
		}
		return findIndex(arr,target,index+1);
		
	}

}
