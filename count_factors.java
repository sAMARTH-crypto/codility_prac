package codility;
import java.util.Scanner;

public class count_factors {
	
	public int solution(int N) {
		int count  = 0;
		for(int i=1; i*i<=N; i++) {
			
			if(N%i==0)  {
				count++;
				
				 if (i != N/i) {
	                    count++;
	                }
			}
			
				
		}return count;
		
		
	}
	

	public static void main(String[] args) {
		
		count_factors count = new count_factors();
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.print("No.of factors: " + count.solution(N));
		
		
	}

}
