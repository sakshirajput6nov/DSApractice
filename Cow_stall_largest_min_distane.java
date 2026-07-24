package monu;
import java.util.Arrays;
import java.util.Scanner;
public class Cow_stall_largest_min_distane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ncow=3;
		int nstall=5;
		int[]arr=new int[nstall];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Min_distance(arr,ncow));
	}
	public static int Min_distance(int[]arr,int ncow) {
		int s=arr[0];
		int e=arr[arr.length-1];
		int ans=0;
		while(s<=e) {
			int mid=(s+e)/2;
			if(isItPossible(arr,ncow,mid)==true) {
				ans=mid;
				s=mid+1;
			}
			else {
				e=mid-1;
			}
		
		}
		return ans;
	
	}
	public static boolean isItPossible(int[]arr,int ncow,int mid) {
		int pos=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-pos>=mid) {
				count++;
				pos=arr[i];
			}
			if(ncow==count) {
				return true;
			}
		}
		return false;
		
	}
}
