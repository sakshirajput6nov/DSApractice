package Recursion;

public class R9_steps123_reachDestination5 {
// if have only 1, 2,3 steps only 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bp(4,0,"");
	}

	private static void bp(int des, int  cur, String s) {
		if(cur==des) {
			System.out.print(s+" ");
			return;
			
		}
		else if(cur>des) {
			return;
		}
//		bp(des,cur+1,s+1);
//		bp(des,cur+2,s+2);
//		bp(des,cur+3,s+3);
		for(int d=1;d<=3;d++) {
			bp(des,cur+d,s+d);
		}
	}

}
//1111 112 121 13 211 22 31