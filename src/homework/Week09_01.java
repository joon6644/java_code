package homework;

import java.util.Scanner;

public class Week09_01 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열? ");
		String str1 = sc.next();
		System.out.print("두번째 문자열? ");
		String str2 = sc.next();
		System.out.println("결과: " + merge(str1, str2));
		
		sc.close();
	}
	
	public static String merge(String str1, String str2) {
		return str1 + " " + str2;
	}

}
