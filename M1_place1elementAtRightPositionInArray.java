package monu1;

public class M1_place1elementAtRightPositionInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,7,2,3,8,1,4};
		int idx=0;
		int ele=arr[arr.length-1];
		rightPosition(arr,idx,ele);
	}

	private static void rightPosition(int[] arr, int idx, int ele) {
		System.out.println("pivot element "+ele);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=ele) {
				swap(i,idx,arr);
				idx++;
			}
		}
		swap(idx,arr.length-1,arr);
		display(arr);
		
	}

	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
	}

	private static void swap(int idx1, int idx2,int[]arr) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		return;
		
		
	}
//	pivot element 4
//	2  3  1  4  8  5  7  
}
