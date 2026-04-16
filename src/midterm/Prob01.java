package midterm;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		System.out.printf("합은 %.1f", (i + j));
		System.out.println(" 곱은 " + (i * j));
	
		
		sc.close();
	}

}
