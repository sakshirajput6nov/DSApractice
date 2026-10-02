package monu1;

public class M2_LC647_palindromic_substring_OptimizedN2 {
	public static void main(String[] args) {
		
		String s = "aaa";
		
		int ans = countSubstrings(s);
		
		System.out.println(ans);
	}

	private static int countSubstrings(String s) {
		   
				int count=0;
				// odd 
				for(int axis=0;axis<s.length();axis++) {
					for(int orbit=0;axis-orbit>=0 && orbit+axis<s.length();orbit++) {
						if(s.charAt(orbit+axis)!=s.charAt(axis-orbit)) {
							break;
						}
						count++;
					}
				}
				// even
				for(double axis=0.5;axis<s.length();axis++) {
					for(double orbit=0.5;axis-orbit>=0 && orbit+axis<s.length();orbit++) {
						if(s.charAt((int)(orbit+axis))!=s.charAt((int)(axis-orbit))) {
							break;
						}
						count++;
					}
				}
				return count;
			}
	
}
