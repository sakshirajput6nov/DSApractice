package Recursion;

public class find_element_first_occurence_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,34,5,2,3,4,5};
		
		System.out.println(search(arr,0,134));
	}
	public static int search(int[]arr,int index,int target) {
		if(index==arr.length) {
			return -1;
		}
		if(target==arr[index]) {
			return index;
		}

		return search(arr,index+1,target);
	}
}
