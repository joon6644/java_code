package midterm;

import java.util.Scanner;

public class Prob09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		} 
		
		System.out.print("1) odd 2) even: ");
		int input = sc.nextInt();
		

		for (int i = input - 1; i < 10; i = i + 2) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}
