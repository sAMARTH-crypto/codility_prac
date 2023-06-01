public class codility_maxslicesum {
	
	public int solution(int A []){
		
		int currSum = A[0]; //max sum 
		int maxSum = A[0];  //current sum of subarray
		
		for(int i =1; i<A.length; i++) {
			
			currSum = Math.max(A[i], currSum + A[i]);
      
			maxSum = Math.max(maxSum, currSum);

				
		}
		return maxSum;
	}
