package Recursion;
import java.util.*;
public class R25_leetcode131_palindromePartitioning {

	public static void main(String[] args) {
		String ques="nitin";
		List<String>l=new ArrayList<>();
		List<List<String>>fl=new ArrayList<>();
		Partition(ques,"",l,fl);
//		Partitioning(ques,"");
		System.out.println(fl);
		

	}

	private static void Partition(String ques, String ans, List<String> l, List<List<String>> fl) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			 fl.add(new ArrayList<String>(l));
			 return;
		}
		for(int i=0;i<ques.length();i++) {
			String s=ques.substring(0,i+1);// answer 
			
			if(isPalindrome(s)) {
				l.add(s);
				Partition(ques.substring(i+1),ans+s,l,fl);
				l.remove(l.size()-1);
			}
		}
		
		
	}
//	using partition by nested list of String
//	[[n, i, t, i, n], [n, iti, n], [nitin]]
	
	
//	private static void Partitioning(String ques, String ans) {
//		if(ques.length()==0) {
//			System.out.println(ans);
//			return;
//		}
//		for(int i=0;i<ques.length();i++) {
//			String s=ques.substring(0,i+1);// answer 
//			if(isPalindrome(s)) {
//			Partitioning(ques.substring(i+1),ans+s+"|");
//			}
//		}
//		
//	}

	private static boolean isPalindrome(String s) {
		if(s.length()==0||s.length()==1) {
			return true;
		}
		int start=0;
		int end=s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
// when only partitioning
//n|i|t|i|n|
//n|i|t|in|
//n|i|ti|n|
//n|i|tin|
//n|it|i|n|
//n|it|in|
//n|iti|n|
//n|itin|
//ni|t|i|n|
//ni|t|in|
//ni|ti|n|
//ni|tin|
//nit|i|n|
//nit|in|
//niti|n|
//nitin|


// when also check palindrome and partitioning
//n|i|t|i|n|
//n|iti|n|
//nitin|

