package homework;

import java.util.Scanner;

public class Week09_02 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < 5; ++i) {
			a[i] = sc.nextInt();
		}
		System.out.println("Max: " + find_max(a));
		sc.close();
	}
	
	public static int find_max(int[] a) {
		int max_val = a[0]; 
		for (int i = 1; i < 5; i++) {
			if (a[i] > max_val) {
				max_val = a[i];
			}
		}
		return max_val;
	}

}
