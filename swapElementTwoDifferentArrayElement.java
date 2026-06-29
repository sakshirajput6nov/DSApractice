package monu;

public class swapElementTwoDifferentArrayElement {
// can swap globally 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[]arr1= {1,2,3};
				int[]arr2= {10,20,30};
				System.out.println(arr1[0]);
				swap(arr1,arr2);
				System.out.println(arr2[0]);
				}
			public static void swap(int[]arr1,int[]arr2) {
				System.out.println(arr1[0]);
				int temp=arr1[0];
				arr1[0]=arr2[0];
				arr2[0]=temp;
				System.out.println(arr2[0]);

	}

}
