package kunal;
import java.util.*;


public class FindAllIndexOfelement {
	static ArrayList<Integer> list=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,131,14,2,131,4};
		int target=1311;
		
		findAllIndex(arr,target,0);
		System.out.println(list);

	}
	
	static void findAllIndex(int[]arr,int target,int index) {
		if(arr.length==index) {
			return ;
		}
		if(target==arr[index]) {
			list.add(index);
		}
		findAllIndex(arr,target,index+1);
		
	}

}
