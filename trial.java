package kunal;

public class trial {
	public static void main(String[]args) {
		String str="ffd";
		boolean result=true;
//		if( str==null) {
//			result=true;
//		}
		
		int s=0;
		int e=str.length()-1;
		
		while(s<e) {
			if(str.charAt(e)!=str.charAt(s)) {
				result=false;
			}
			s++;
			e--;
			
		}
		
		
	
		System.out.println(result);
//		StringBuilder s=new StringBuilder(str);
//		StringBuilder s1=new StringBuilder(s.reverse());
//		s.append(12);
//		s.append('a');
//		s.capacity();
//		s.reverse();
		
		
//		System.out.println(s.compareTo(s1));
	}

}
