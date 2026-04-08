package kunal;

public class removecharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asdfgaert";
		System.out.println(result(str,0));

	}
	static String stri="";
	static String result(String str,int index) {
		if(str.length()==index) {
			return stri;
		}
		if(str.charAt(index)!='a') {
			stri+=str.charAt(index);
		}
		return result(str,index+1);
	}
	

}
