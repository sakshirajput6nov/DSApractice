package kunal;
import java.util.*;
///////////////////
public class returnArrayListsubsets {
	static ArrayList<String> list=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findAllSubset("","abcd",list);
		System.out.println(list);
		
	}
	
	static void findAllSubset(String p,String up, ArrayList <String> list){
		if(up.isEmpty()) {
			list.add(p);
			return;
		}
		char value=up.charAt(0);
		 findAllSubset(p + value,up.substring(1),list);
		 findAllSubset(p,up.substring(1),list);
	}

}
