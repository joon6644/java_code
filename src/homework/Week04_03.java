package homework;

import java.util.Scanner;

public class Week04_03 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나: ");
		char user = sc.next().charAt(0);
		char com = (char) (Math.random() * 26 + 'A');
		System.out.println("컴퓨터: " + com);
		
		if (user >= com) {
			System.out.println(com + " " + user);
		} else {
			System.out.println(user + " " + com);
		}
		
		sc.close();
	}

}
