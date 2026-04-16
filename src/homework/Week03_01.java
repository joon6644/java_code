package homework;

import java.util.Scanner;

public class Week03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("60250770 전준태");
		
		int n = 2, a = 3, b = 4, c = 5;
		
		System.out.println(a + "x^" + n + "+" + b + "x+" + c + "일 때 x의 값을 입력하시오.");
		System.out.print("x = ");
		
		int num = sc.nextInt();
		
		long y = (long) (a * Math.pow(num, 2) + b * num + c);
		
		System.out.println("y = " + y);
		
		sc.close();
	}

}
