package kunal;

public class findSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAllSubset("","abcd");

	}
	static void findAllSubset(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char value=up.charAt(0);
		findAllSubset(p + value,up.substring(1));
		findAllSubset(p,up.substring(1));
	}

}
