package midterm;

import java.util.Scanner;

public class gcd_lcm {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int GCD = 1;
		
		for (int x = Math.min(n1, n2); x > 0; x--) {
			if (n1 % x == 0 && n2 % x ==0) {
				GCD = x;
				break;
			}
		}
		
		int LCM = (n1 * n2) / GCD;
		
		System.out.println("최대공약수: " + GCD);
		System.out.println("최소공배수: " + LCM);
		
		sc.close();
	}

}
