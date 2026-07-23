package Qspider;
import java.util.*;
public class Q4_usage_Scanner_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//case 1
		int age1=sc.nextInt();// 23| take only 23
		sc.nextLine();
		String name1=sc.nextLine();// skipped 
		System.out.println(age1+name1);
//		//case 2
		String name2=sc.nextLine();// sakshi rajput| take full  sakshi rajput|
		// corrected by this 
		int age2=sc.nextInt();//error 
		sc.nextLine();
		System.out.println(age2+name2);
		//case 3
		String name3=sc.nextLine();//sakshi rajput|
		String name4=sc.nextLine();// correct 
		System.out.println(name3+name4);
	}

}


