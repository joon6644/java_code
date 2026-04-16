package homework;

import java.util.Scanner;

public class Week04_04 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("잘못된 값");
		} else {
			int days = 28;
			
			if (month >= 8) {
				month += 1;
			}
			
			if (month != 2) {
				if (month % 2 == 0) {
					days = 30;
				} else {
				days = 31;
				}
			}
			
			System.out.println(days);
		}
		
		sc.close();
	}

}
