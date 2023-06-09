public class absDistinct {

	public int solution(int[] A) {
		
		 HashSet<Integer> set = new HashSet<>();
		
		int count = 0;
		
		 for (int num : A) {
			 
	            int absNum = Math.abs(num);
	            
	            if (!set.contains(absNum)) {
	                count++;
	                set.add(absNum);
	            }
	        }

		return count;
	}
	
