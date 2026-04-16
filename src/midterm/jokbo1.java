package midterm;

import java.util.Scanner;

public class jokbo1 {

	public static void main(String[] args) {
		p6();
	}
	
	public static void p1() {
		// 1-1. int형 변수에 정수값을 저장하려면 반드시 명시적인 형변환을 해야한다. (O/X) 
		// 1-2. 자바에서는 들여쓰기를 무시해도 프로그램 실행에 아무런 문제가 없다. (O/X)
		// 1-3. boolean 자료형에는 true나 false 외에는 어떠한 값도 가질 수 없다. (O/X)
		// 1-4. 아래 코드의 실행 결과를 작성하였는데 에러가 발생하였다. 이유를 쓰시오. (답만 쓰시오)
		/* 
		 * public static void main(String args[]){
		 *    int r;
		 *    for(int i=1; i<5; ++i){
		 *        r = r + i;
		 *    }
		 *    System.out.println(r);
		 * }
		 */
	}
	
	public static void p2() {
		/*
		 * 문자 하나를 입력받고 알파벳 대문자이면 "Alphabet"을 출력하고 그 외는 “non-Alphabet” 출력하시오. [20점]
		 */
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		if ((char) input.charAt(0) >= 'A' && (char) input.charAt(0) <= 'Z' ) {
			System.out.println("Alphbet");
		} else {
			System.out.println("non-Alphbet");
		}
		
		sc.close();
	}
	
	public static void p3() {
		/*
		 * 정수를 입력받은 뒤 그 수의 제곱과 세 제곱 값을 출력하시오. [20점] 
		 */
	}
	
	public static void p4() {
		/*
		 * 정수를 반복적으로 입력받다가 0이 입력되면 그동안 입력된 값들 중 홀수의 개수를 출력하시오. [20점]
		 */
	}
	
	public static void p5() {
		/*
		 * 숫자 다섯 개를 입력받아서 가장 작은 값을 출력하시오. [20점]
		 */
	}
	
	public static void p6() {
		/*
		 * 이번 학기가 몇학기째인지를 입력하면 학년을 출력하시오. (1,2는 1학년, ... 7,8은 4학년, 9이상도 4학년)
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(Math.min(4, (n + 1) / 2));
		
		sc.close();
	}
	
	public static void p7() {
		/*
		 * 아래 결과대로 출력하시오. [개당 10점, 총 40점] 
		 * (이중 for문을 반드시 써야 정답으로 인정받을 수 있음) 
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j <= 4) {
					System.out.print("X ");
				} else {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i == 0 || j == 0) || (i == 4 || j == 4)){
					System.out.print("X ");
				} else {
					System.out.print("O ");
				}
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		System.out.println("============================");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (i + j <= 4) {
					System.out.print(2 * j + 1 + " ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void p8() {
		/*
		 * MBTI는 I와 E, S와 N, T와 F, J와 P의 조합으로 이루어진다. 임의의 MBTI유형을 출력하시오.  
		 * (Math.random()함수를 네 번 이용하는 것을 권장함) [20점]
		 */	
		String[] arr = {"I", "E", "S", "N", "T", "F", "J", "P"};
		
		String MBTI = "";

		for (int i = 0; i < 4; i++) { // 0, 1, 2, 3
			int rand = (int) (Math.random() * 2); // 0 or 1
			MBTI += arr[2 * i + rand];	
		}
		
		System.out.println(MBTI);
	}
	
	public static void p9() {
		/*
		 * 정수를 입력받아서 그 수의 각 자리수 합을 구하시오. [20점]
		 */
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		int sum = 0;
		
		for (int i = 0; i < input.length(); i++) {
			sum += input.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
		sc.close();
	}
	
	public static void p10() {
		/*
		 * 정수 5개 입력받은 뒤 정수 하나를 더 받아서 포함 여부를 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for (int i = 0; i < 5; i++) {
			if (input == arr[i]) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("Included");
		} else {
			System.out.println("Not Included");
		}
		
		sc.close();
	}
	
	

}
