package Recursion;

public class R29_mergeTwoSortedArray_Into1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {1,23,44,55};
		int []arr2= {2,5,7,9,11,45,121};
		merge(arr1,4,arr2,7);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[]arr=new int[m+n];
        int j=0;
        int i=0;
        int k=0;
        while( i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(j<n){// print remaining elements
        	arr[k]=nums2[j];
        	j++;
        	k++;
        	
        }
         while(i<m){
        	arr[k]=nums1[i];
         	i++;
         	k++;
        }
       for(int ii=0;ii<arr.length;ii++){
            System.out.print(arr[ii]+" ");
       }
    }

}
//1 2 5 7 9 11 23 44 45 55 121 