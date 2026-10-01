package Recursion;

public class R30_Sudoku {

	public static void main(String[] args) {
		int[][] grid = {
			    {3, 0, 6, 5, 0, 8, 4, 0, 0},
			    {5, 2, 0, 0, 0, 0, 0, 0, 0},
			    {0, 8, 7, 0, 0, 0, 0, 3, 1},
			    {0, 0, 3, 0, 1, 0, 0, 8, 0},
			    {9, 0, 0, 8, 6, 3, 0, 0, 5},
			    {0, 5, 0, 0, 9, 0, 6, 0, 0},
			    {1, 3, 0, 0, 0, 0, 2, 5, 0},
			    {0, 0, 0, 0, 0, 0, 0, 7, 4},
			    {0, 0, 5, 2, 0, 6, 3, 0, 0}
			};
		sudoku(grid,0,0);

	}

	private static void sudoku(int[][] grid, int cr, int cc) {

		if(cc==grid[cr].length) {
			cc=0;
			cr++;
			
		}
		if(cr==grid.length) {
			display(grid);
			return;
		}
		
		if(grid[cr][cc]!=0) {
			sudoku(grid,cr,cc+1);
		}
		else {
			
			for(int val=1;val<=9;val++) {
				if(isItSafe(grid,cr,cc,val)) {
				grid[cr][cc]=val;
				sudoku(grid,cr,cc+1);
				grid[cr][cc]=0;
				}
			}
		}
		
		
		
	}

	private static boolean isItSafe(int[][] grid, int cr, int cc, int val) {
		//check for 
		//row
		for(int k=0;k<9;k++) {
			if(grid[cr][k]==val) {
				return false;
			}
		}
		//col
		for(int s=0;s<9;s++) {
			if(grid[s][cc]==val) {
				return false;
			}
		}
		//3X3 matrix
		int r=cr-cr%3;
		int c=cc-cc%3;
		for(int p=r;p<r+3;p++) {
			for(int q=c;q<c+3;q++) {
				if(grid[p][q]==val) {
					return false;
				}
			}
		}
		return true;
	}

	private static void display(int[][] grid) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
