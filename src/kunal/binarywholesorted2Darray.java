package kunal;

public class binarywholesorted2Darray {
	
		public static void main (String[]args) {
			int[][]arr= {
					{1,2,3,4},{5,6,7,8},{9,10,11,12}
			};
			int target=6;
			System.out.println(Dsorted(arr,target));
		}
		public static boolean Dsorted(int[][]matrix,int target) {
			
		
	    int r=0;
	    int c=matrix[0].length-1;
	    boolean result=false;
	    while(r<matrix.length && c>=0){
	        if(matrix[r][c]==target){
	            return true;
	        }
	        else if(matrix[r][c]<target){
	        	
	            r++;
	            

	        }
	        else{
	            c--;
	        }
	    }
	    return result;
		}

	}



