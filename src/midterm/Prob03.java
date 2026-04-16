package midterm;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char grade = sc.next().charAt(0);
		
		double ans = 4.0 - (grade - 'A');
		
		if (ans == -1.0) {
			System.out.println(0.0);
		} else {
			System.out.println(ans);
		}
		

		
		
		sc.close();
	}

}
