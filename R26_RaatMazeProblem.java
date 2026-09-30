package Recursion;
import java.util.*;
public class R26_RaatMazeProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nrow =5;
		int ncol=4;
//		String [][]arr=new String[nrow][ncol];
		int [][]ans=new int[nrow][ncol];
//		for(int i=0;i<nrow;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=sc.next();
//			}
//		}
		String [][]arr= {{"O","X","O","O"},{"O","O","O","X"},{"X","O","X","O"},{"X","O","O","X"},{"X","X","O","O"}};
		int crow=0;
		int ccol=0;
		RatMaze(crow,ccol,nrow,ncol,arr,ans);
		if(!flag) {
			System.out.println("Path not found");
		}

	}
	static boolean  flag=false;

	private static void RatMaze(int crow, int ccol, int nrow, int ncol,String[][]arr,int[][]ans) {
		if(crow==nrow-1 && ccol==ncol-1 && !arr[crow][ccol].equals("X")) {
//			System.out.println(ans);
			ans[crow][ccol]=1;
			flag=true;
			for (int i = 0; i < ans.length; i++) {

	            for (int j = 0; j < ans[i].length; j++) {

	                System.out.print(ans[i][j] + " ");

	            }

	            System.out.println();

	        }
			return;
		}
		if(crow >=nrow || ccol>=ncol ||crow<0||ccol<0 ) {
			return;
		}
		if(arr[crow][ccol].equals("X")) {
			return;
		}
		arr[crow][ccol]="X";// avoid deadlock,dubara nahi aaye
		ans[crow][ccol]=1;// visited
		int []r= {0,0,1,-1};//right ,left,down,up directions
		int []c= {1,-1,0,0};
		for(int i=0;i<r.length;i++) {
			RatMaze(crow+r[i],ccol+c[i],nrow,ncol,arr,ans);
		}
		arr[crow][ccol]="O";
		ans[crow][ccol]=0;
		
		
	}

}
//1 0 0 0 
//1 1 0 0 
//0 1 0 0 
//0 1 1 0 
//0 0 1 1


