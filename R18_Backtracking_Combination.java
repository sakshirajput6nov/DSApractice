package Recursion;
// Combination
public class R18_Backtracking_Combination {
	public static void main(String[] args) {
		int x=4;
		boolean[]box=new boolean[x];
		int tq=2;
		String ans="";
		int qpsf=0;
		int index=0;
		QueenSit(box,tq,qpsf,ans,index);

	}

	private static void QueenSit(boolean[] box, int tq, int qpsf, String ans,int index) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=index;i<box.length;i++) {
			if(box[i]==false) {
				box[i]=true;
				QueenSit(box,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				box[i]=false;
//				// for undo i.e backtracking 
//				b0q0b1q1
//				b0q0b2q1
//				b0q0b3q1
//				b1q0b2q1
//				b1q0b3q1
//				b2q0b3q1
				
			}
		}
	}

}
