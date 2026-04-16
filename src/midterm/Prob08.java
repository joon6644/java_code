package midterm;

import java.util.Scanner;

public class Prob08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		switch (input % 2) {
		case 1:
			System.out.println("odd number");
			break;
		case 0:
			System.out.println("even number");
			break;
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
