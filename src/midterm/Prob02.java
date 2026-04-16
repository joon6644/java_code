package midterm;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			int rand = (int) (Math.random() * 10) + 1;
			System.out.print(rand + " ");
			sum += rand;
		}
		
		System.out.println("\n" + sum);
		
		sc.close();
	}

}
