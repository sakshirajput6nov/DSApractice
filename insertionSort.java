package monu;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {2,5,7,1,6,3,4};
for(int i=1;i<arr.length;i++) {
	int picked=arr[i];
	int j=i-1;
	while(j>=0 && arr[j]>picked) {
		arr[j+1]=arr[j];
		j--;
	}
	arr[j+1]=picked;
}
System.out.println(Arrays.toString(arr));
	}

}
