package Recursion;
import java.util.*;
public class R23_Leetcode77_NestedList_1tonElementCombinationOfKsizeList {
	public static void main(String[]args) {
		System.out.println(combine(7,2));
	}
	
	
    public static List<List<Integer>> combine(int n, int size) {
        List<Integer>l=new ArrayList<>();
        List<List<Integer>>fl=new ArrayList<>();
        helper(n,size,l,fl,0);
        return fl;
    }
    public static void helper(int n,int size,List<Integer>l,List<List<Integer>>fl,int idx){
        if(l.size()==size){
        
            fl.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx+1;i<=n;i++){
            l.add(i);
            helper(n,size,l,fl,i);
            l.remove(l.size()-1);
        }
    }
}
//[[1, 2], [1, 3], [1, 4], [1, 5], [1, 6], [1, 7], [2, 3], [2, 4], [2, 5], [2, 6], [2, 7], [3, 4], [3, 5], [3, 6], [3, 7], [4, 5], [4, 6], [4, 7], [5, 6], [5, 7], [6, 7]]