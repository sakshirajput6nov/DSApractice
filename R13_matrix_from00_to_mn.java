//package Recursion;

//public class R13_matrix_from00_to_mn {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int re=3;
//		int ce=3;
//		matrix(1,1,re,ce,"");
//		System.out.println(count);
//	}
//	static int count=0;
//	private static void matrix(int row, int col,int re ,int ce,String ans) {
//		if(re==row && ce==col) {
//			count++;
//			System.out.println(ans);
//			return;
//		}
//		if(row>re ||col>ce) {
//			return;
//		}
//		matrix(row+1,col,re,ce,ans+"V");
//		matrix(row,col+1,re,ce,ans+"H");
//		
//	}
//	
//	
//
//}
//VVHH
//VHVH
//VHHV
//HVVH
//HVHV
//HHVV
//6

package Recursion;
// without static count 
public class R13_matrix_from00_to_mn {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int re=3;
		int ce=3;
		
		System.out.println(matrix(1,1,re,ce,""));
	}
	
	private static int matrix(int row, int col,int re ,int ce,String ans) {
		if(re==row && ce==col) {
			
			System.out.println(ans);
			return 1;
		}
		if(row>re ||col>ce) {
			return 0;
		}
		int s1=matrix(row+1,col,re,ce,ans+"V");
		int s2=matrix(row,col+1,re,ce,ans+"H");
		return s1+s2;
	}
	
	

}