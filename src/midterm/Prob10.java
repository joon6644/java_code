package midterm;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < 10; i++) {
			int val = sc.nextInt();
			
			if (val > max) {
				max = val;
			}
		} 
		
		for (int i = 0; i < 10; i++) {
			int val = sc.nextInt();
			
			if (val > max2 && val != max) {
				max2 = val;
			}
		} 
		
		
		System.out.println("max: " + max + " 2nd: " + max2);
		
		

		sc.close();
	}

}
