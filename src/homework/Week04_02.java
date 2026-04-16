package homework;

import java.util.Scanner;

public class Week04_02 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next().toLowerCase();
		String output; 
		
		switch (input) {
			case "korea":
				output = "대한민국";
				break;
			case "china":
				output = "중국";
				break;
			case "vietnam":
				output = "베트남";
				break;
			default:
				output = "해당없음";
		}
		
		System.out.println(output);
		
		sc.close();
	}

}
