package Recursion;
// permutation 
public class R17_Backtracking_Permutation_nQuuen_xBoxes {

	public static void main(String[] args) {
		int x=4;
		boolean[]box=new boolean[x];
		int tq=2;
		String ans="";
		int qpsf=0;
		QueenSit(box,tq,qpsf,ans);

	}

	private static void QueenSit(boolean[] box, int tq, int qpsf, String ans) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<box.length;i++) {
			if(box[i]==false) {
				box[i]=true;
				QueenSit(box,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				// when no backtracking explicit 
//				b0q0b1q1
//				b0q0b2q1
//				b0q0b3q1
				// b0 q0 se htaya or shoift ki q0 b1 
				box[i]=false;
				// for undo i.e backtracking 
//				b0q0b1q1
//				b0q0b2q1
//				b0q0b3q1
//				b1q0b0q1
//				b1q0b2q1
//				b1q0b3q1
//				b2q0b0q1
//				b2q0b1q1
//				b2q0b3q1
//				b3q0b0q1
//				b3q0b1q1
//				b3q0b2q1
				
			}
		}
	}

}
