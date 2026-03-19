package kunal;
///////////binary Search 
/// find ceiling element or equal element to target
public class binarySearch {
	static int ceilin(int []arr,int target) {
		int start=0;
		int end =arr.length-1;
		if(arr[end]<target) {
			return -1;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return arr[mid];
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return arr[start];
	}
	public static void main (String[]args) {
		int[]ar= {2,3,5,9,14,16,18};
		int target=1;
		System.out.println(ceilin(ar,target));
	}

}
//// in ceiling return ar[start]
/// in floor return ar[end]
/// ////////////////////////////

