package org.java_code.practice;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		// 국영수 점수를 받아서 총점과 평균을 출력
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int sum = a + b + c;
		double avg = (double) sum / 3;
		System.out.println(sum);
		System.out.println(avg);
		
		sc.close();
	}
}
