package kunal;

public class skipAppNotApple {
	public static void main(String[] args) {
	String p="ap@123";
	String o="app@123";
	String target="app";
	String notTarget="apple";
	System.out.println(skipAppString(p,target,notTarget));
	System.out.println(skipAppString(o,target,notTarget));
	}
	static String skipAppString(String up,String target,String notTarget) {
		if(up.isEmpty()) {
			return "";
			
		}
		int len=target.length();
		int lenNotTarget=notTarget.length();
		if(up.startsWith(target) && !(up.startsWith(notTarget))) {
			return skipAppString(up.substring(len),target,notTarget);
		}
		
		else {
			return up.charAt(0)+ skipAppString(up.substring(1),target,notTarget);
		}
		
	}
}
