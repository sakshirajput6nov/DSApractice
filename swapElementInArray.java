package monu;

public class swapElementInArray {
   // when swap an element in aray by method out of method changes reflect 
	// but when swap between two arrays so not 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {1,2,3};
		System.out.println(arr1[0]+"before call");
		swap(arr1);
		System.out.println(arr1[0]+"after call");

	}
	public static void swap(int[]arr1) {
		int temp=arr1[0];
		arr1[0]=arr1[1];
		arr1[1]=temp;
		System.out.println(arr1[0]+"in call");
	}

}
