package homework;

import java.util.Scanner;

public class Week05_01 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		boolean isPrime = true;

		if (num > 1) {
			int i = 2;
			while (i * i <= num) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}
		} else {
			isPrime = false;
		}

		String S = "은";
		switch (num % 10) {
			case 2, 4, 5, 9:
				S = "는";
				break;
		}

		if (isPrime) {
			System.out.println(num + S + " 소수입니다.");
		} else {
			System.out.println(num + S + " 소수가 아닙니다.");
		}

		sc.close();
	}

}
