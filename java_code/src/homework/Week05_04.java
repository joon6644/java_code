package homework;

import java.util.Scanner;

public class Week05_04 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int cnt = 0;
		System.out.print("공약수: ");
		
		for (int i = 1; i <= Math.min(n1, n2); i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				System.out.print(i + " ");
				cnt += 1;
			}
		}
		
		System.out.println("\n" + n1 + "과 " + n2 + "의 공약수는 " + cnt + "개입니다.");
		
		sc.close();
	}

}
