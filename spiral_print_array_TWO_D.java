package monu;

import java.util.Arrays;

public class spiral_print_array_TWO_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int count=0;
		int total=arr.length*arr[0].length;
		int minc=0;
		int minr=0;
		int maxc=arr[0].length-1;
		int maxr=arr.length-1;
		while(count<total) {
			for(int i=minc;i<=maxc && count<total;i++) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			for(int j=minr;j<=maxr && count<total;j++) {
				System.out.print(arr[j][maxc]+" ");
				count++;
			}
			maxc--;
			for(int k=maxc;k>=minc && count<total;k--) {
				System.out.print(arr[maxr][k]+" ");
				count++;
			}
			maxr--;
			for(int m=maxr;m>=minr && count<total;m--) {
				System.out.print(arr[m][minc]+" ");
				count++;
			}
			minc++;
			
		}
		
	}

}
