package midterm;

import java.util.Scanner;

public class jokbo2 {

	public static void main(String[] args) {
		p7();
	}

	public static void p1() {
		/*
		 * 1. 두 정수를 입력받은 뒤 두 수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력하시오. [20점]
		 * (반드시 아래와 같은 모습으로 출력해야 점수를 다 받을 수 있음)
		 * 실행결과 예시)
		 * 4 3
		 * 4+3=7
		 * 4-3=1
		 * 4*3=12
		 * 4/3=1
		 * 4%3=1
		 */		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "%" + b + "=" + (a % b));
		
		sc.close();
	}

	public static void p2() {
		/*
		 * 2. 숫자를 반복적으로 입력받으면서 합을 구하다가 0이 입력되면 
		 * 그동안 입력된 값들 전체의 합을 출력하시오. [20점]
		 * 실행결과 예시) 5, 2, 3, 0 입력 -> 10 출력
		 */
		Scanner sc  = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			int input = sc.nextInt();
			if (input == 0) break;
			sum += input;
		}
		
		System.out.println(sum);
		
		sc.close();
	}

	public static void p3() {
		/*
		 * 3. 문자 하나를 입력받고 소문자이면 "lower case", 대문자이면 "upper case"를 출력하고 
		 * 그 외의 문자는 "wrong input"을 출력하시오. [20점]
		 */
		Scanner sc  = new Scanner(System.in);
		
		String input = sc.next();
		
		if (input.equals(input.toUpperCase())) {
			System.out.println("upper case");
		} else if (input.equals(input.toLowerCase())) {
			System.out.println("lower case");
		} else {
			System.out.println("wrong input");
		}
		
		sc.close();
	}

	public static void p4() {
		/*
		 * 4. 트럼프 카드는 스페이드, 하트, 클로버, 다이아몬드 중 하나로 구성되고 
		 * 1부터 10, 그리고 J, Q, K 중 하나로 이루어진다. 
		 * 임의의 카드를 생성하시오. [20점] (예: 스페이드3, 하트J)
		 */
		int a = (int) (Math.random() * 4);
		int b = (int) (Math.random() * 13) + 1;
		
		String[] arr = {"스페이드", "하트", "클로버", "다이아몬드"};
		String card = arr[a];
		
		switch (b) {
		case 11:
			card += "J";
			break;
		case 12:
			card += "Q";
			break;
		case 13:
			card += "K";
			break;
		default:
			card += b;
		}
		
		System.out.println(card);	
	}

	public static void p5() {
		/*
		 * 5. 다음 문제에 답하시오. [20점] (각 5점. 주석으로 답안 작성)
		 * * 5-1. double형 변수에 정수 값을 저장하려면 반드시 명시적인 형변환을 해야한다. (O/X)
		 * 답: X
		 * * 5-2. 자바에서는 들여쓰기를 무시해도 프로그램 실행에 아무런 문제가 없다. (O/X)
		 * 답: O
		 * * 5-3. 아래 코드의 빈 칸을 채우시오. (1, 2, 3, 4번에 들어갈 코드)
		 * 	public static void main(String args[]){
		 * 		for(int i=1; i<=10; ++i){
		 * 			if(i >= 5){
		 * 				( 1 ) // 여기에 들어갈 제어문
		 * 			}
		 * 			System.out.println(i);
		 * 		}
		 * 	}
		 * 답: break 또는 continue
		 * * 5-4. 아래 코드에서 에러가 발생하는 이유를 쓰시오.
		 * 	public static void main(String args[]){
		 * 		int t, b;
		 * 		for(int i=1; i<5; ++i){
		 * 			t = t * i;
		 * 		}
		 * 		System.out.println(t);
		 * 	}
		 * 답: t에 값을 할당하는 부분이 반복문 안에만 있는 상태로 t를 사용하려 해서
		 */
	}

	public static void p6() {
		/*
		 * 6. 숫자 다섯 개를 입력받아서 가장 큰 값과 가장 작은 값을 출력하시오. [20점]
		 * 실행결과 예시)
		 * 1 30 60 44 99 -> max: 99 min: 1
		 */
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			if (input > max) {
				max = input;
			}
			if (input < min) {
				min = input;
			}
		}
		System.out.println("max: " + max + " min: " + min);
		
		sc.close();
	}

	public static void p7() {
		/*
		 * 7. 아래 결과대로 출력하시오. [개당 10점, 총 40점] 
		 * (이중 for문을 반드시 써야 정답으로 인정받을 수 있음) 
		 * * 실행결과)
		 *   * * * *
		 * *   * * *
		 * * *   * *
		 * * * *   *
		 * * * * * 
		 * * 실행결과)
		 * 25 24 23 22 21
		 * 20 19 18 17 16
		 * 15 14 13 12 11
		 * 10 9 8 7 6 
		 * 5 4 3 2 1
		 * * 실행결과)
		 * A B C D E
		 * B C D E F
		 * C D E F G
		 * D E F G H
		 * E F G H I
		 * * 실행결과)
		 * 15 14 13 12 11
		 * 10 9 8 7
		 * 6 5 4
		 * 3 2
		 * 1
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(5 * (5 - i) - j + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((char) (i + j + 'A') + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		int a = 15;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j <= 4) {
					System.out.print(a-- + " ");
				}
			}
			System.out.println();
		}
	}

	public static void p8() {
		/*
		 * 8. 정수를 입력받고 홀수이면 "odd number", 짝수이면 "even number"를 출력하시오. [20점]
		 * (반드시 switch case 문을 활용해야 함. if문 사용 시 오답 처리)
		 */
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		switch (i % 2) {
		case 0:
			System.out.println("even number");
			break;
		case 1:
			System.out.println("odd number");
			break;
		}
		
		sc.close();
	}

	public static void p9() {
		/*
		 * 9. 다섯 개의 숫자를 입력받는다. 
		 * 1을 입력하면 순서대로(Forwards), 2를 입력하면 거꾸로(Backwards) 출력하시오. [20점]
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("1)Forwards 2)Backwards : ");
		int key = sc.nextInt();
		
		if (key == 1) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} else if (key == 2) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[arr.length - 1 - i] + " ");
			}
		}
		
		sc.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}