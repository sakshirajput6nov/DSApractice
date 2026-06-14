public class slidingWnidowMaxSumFixedWindow {

	public static void main(String[] args) {

		int[] arr = {23,45,24,12,38,90};

		int k = 3;
		
		int sum = 0;
		

		for(int i = 0; i < 3; i++) {
			sum += arr[i];
		}
		int maxiSum=sum;

		for(int j = k; j < arr.length; j++) {

			 int currentSum= sum + arr[j] - arr[j-k];
			 sum=currentSum;

			if(maxiSum < currentSum) {
				maxiSum=currentSum;
			}
		}

		System.out.println("maxi Sum is " + maxiSum);
	}
}
