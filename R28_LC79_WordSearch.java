package Recursion;

public class R28_LC79_WordSearch {

	public static void main(String[] args) {
		String word="pizza";
		// grid m x n
		boolean result=false;
		char[][]grid= {{'a','q','s','r'},{'p','i','z','a','z'},{'p','i','q','m','s'},{'p','i','z','z','y'},{'p','i','z','z','m'}};
		for(int i =0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(word.charAt(0)==grid[i][j]) {
					boolean ans=wordSearch(grid,i,j,word,0);
					if (ans) {
						result=true;
					}
				}
			}
		}
		if(result) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		
		

	}

	private static boolean wordSearch(char[][] grid, int row, int col,String word,int idx) {
		if(idx==word.length()) {
			return true;
		}
		if(row<0||col<0||row>=grid.length||col>=grid[row].length||grid[row][col]!=word.charAt(idx)){
			return false;
		}
		grid[row][col]='*';
		int[] r= {0,0,-1,1};//l r u d
		int[] c= {-1,1,0,0};
		for(int i=0;i<r.length;i++) {
			boolean ans=wordSearch(grid,row+r[i],col+c[i],word,idx+1);
			if(ans) {
				grid[row][col]=word.charAt(idx);
				return true;
			}
		}
		grid[row][col]=word.charAt(idx);
		return false;
		
		
		
	}

}
