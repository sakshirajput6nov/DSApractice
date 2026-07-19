package monu;

public class transpose_twoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<arr[0].length;i++) {// i=col,j=row
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
		}
	}

}
