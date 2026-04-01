package kunal;

public class findElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,131,14,2,31,4};
		int target=131;
		System.out.println(find(arr,target,0));
		
		

	}
	static boolean find(int[]arr,int target,int index) {
		if(arr.length==index) {
			return false;
		}
		if(target==arr[index]) {
			return true;
		}
		return find(arr,target,index+1);
		
	}

}
