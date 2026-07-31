package Recursion;

public class R4_find_element_first_occurence_from_last_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,34,5,2,3,4,5};
		
		System.out.println(search(arr,arr.length-1,2));
	}
	public static int search(int[]arr,int index, int target) {
		if(index==-1) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return search(arr,index-1,target);
	}
}
