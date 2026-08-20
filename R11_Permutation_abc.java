package Recursion;

public class R11_Permutation_abc {
	// for duplicate Character in String  and unique character in String 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutqtion("abc","");
	}

	private static void Permutqtion(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			// for duplicate Character in String 
//			boolean result=true;
//			for(int j=0;j<i;j++) {
//				if(ch==ques.charAt(j)) {
//					result=false;
//					break;
//				}
//			}
//			if(result) {
			String s1=ques.substring(0,i);
			String s2=ques.substring(i+1);
		
			
			Permutqtion(s1+s2,ans+ch);
//			}
		
		}
		
	}

}
//abc 
//acb 
//bac 
//bca 
//cab 
//cba 