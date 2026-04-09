package kunal;

public class skipStringFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p="apple@123";
		String o="app@123";
		String target="apple";
		System.out.println(skipString(p,target));
		System.out.println(skipString(o,target));
	}
	static String skipString(String up,String target) {
		if(up.isEmpty()) {
			return "";
			
		}
		int len=target.length();
		if(up.startsWith(target)) {
			return skipString(up.substring(len),target);
		}
		
		else {
			return up.charAt(0)+ skipString(up.substring(1),target);
		}
		
	}

}
