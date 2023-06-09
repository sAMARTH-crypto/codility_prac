package codility;

public class minPerimRectangle {
	
	public int solution(int N) {
		int minPeri = Integer.MAX_VALUE;
		int i = 1;
		
		while (i*i <= N) {
			if(N%i==0) {
				int j = N/i;
				int perimeter = 2*(i+j);
				
				minPeri = Math.min(minPeri, perimeter);
			}
			i++;
		}
		return minPeri;
		
	}

	public static void main(String[] args) {
	
		minPerimRectangle peri = new minPerimRectangle(); 
		
		System.out.println(peri.solution(22));
	

	}

}
