package Recursion;

public class R27_nQueen {

	public static void main(String[] args) {
		int tq=4;
		boolean [][]board=new boolean[tq][tq];
		int crow=0;
		nQueen(board,tq,crow);
		
	}

	public static void nQueen(boolean[][] board, int tq, int crow) {
		if(board.length<=3) {
			System.out.println("placement no possible");
			return;
		}
		if(tq==0) {
			display(board);
			return;
		}
		for(int i=0;i<board[0].length;i++) {// column no.
			if(isItSafe(board,crow,i)) {
				board[crow][i]=true;
				nQueen(board,tq-1,crow+1);
				board[crow][i]=false;
				
			}
		}
		
	}

	private static boolean isItSafe(boolean [][]board,int crow,int ccol) {
//		if(board[][]==false ||board[][]==false ||board[][]==false) {
//			return false;
//		}
		// check left diagonal
		int ccrow=crow;
		int cccol=ccol;
		
	while(ccrow>=0 && cccol>=0) {
		if(board[ccrow][cccol]) {
				return false;
		}
		ccrow--;
		cccol--;
	}
	int croww=crow;
	int ccoll=ccol;
		
	while(croww>=0 && ccoll<=board[0].length-1) {
		if(board[croww][ccoll]) {
			return false;
		}
		croww--;
		ccoll++;
	}
	int w=crow;
	int l=ccol;
	while(w>=0) {
		if(board[w][l]) {
			return false;
		}
		w--;
	}
	return true;
}
	

	private static void display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++){
//				System.out.print(board[i][j]+" ");
				if(board[i][j]==true) {
					System.out.print("QQQQQ ");
				}
				else {
					System.out.print("NNNNN ");
				}
			}
			System.out.println();

		}
		System.out.println();
	}

}
