package homework;

import java.util.Scanner;

public class Week04_05 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년아님");
		}
		
		sc.close();
	}

}
