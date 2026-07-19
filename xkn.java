package monu;
//x^k<=n 

public class xkn {
	static int search(int k,int n) {
		int s=1;
		int e=n;
		int ans=0;
		while(s<=e) {
			int m=(s+e)/2;
			if(Math.pow(m,k)<=n) {
				ans=m;
				s=m+1;
			}
			
			else {
				
				e=m-1;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int n=87;
		int result=search(k,n);
		System.out.println(result);
	}

}
