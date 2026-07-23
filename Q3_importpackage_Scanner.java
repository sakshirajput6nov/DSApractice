package Qspider;
import java.util.Scanner;
// to compile 
//javac Q3.java
//to run
//java Q3.java
public class Q3_importpackage_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no need to import java.lang.Math static method are there in lang. , 
		//in lang no need to import as by default it is imported in program
		System.out.println(Math.pow(2,3));
		// have to import others like scanner 
		Scanner sc=new Scanner(System.in);
//		System.out.println(sc.nextBoolean());// should accept any form of true false like fALSE like this 
		char ch=sc.nextLine().charAt(2);// correct only when nextLine() method in first user input , it accept all kind of data in string form 
		//
		System.out.println(ch);
		
		
	}
}
