package midterm;

import java.util.Scanner;

public class practice1 {
	
	public static void main(String[] args) {
		p30();
	}
	
	public static void p1() {
		/*
		 * 영어 문자를 받으면 아스키코드 값 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		char input = sc.next().charAt(0);
		System.out.println((int) input);
		
		sc.close();
	}
	
	public static void p2() {
		/*
		 * 입력받은 숫자가 3의 배수인지 아닌지를 출력하시오. 
		 * (switch ~ case 문을 사용해서 구현한 경우 20점, 
		 * 그 외 다른 방법으로 해결한 경우 10점만 인정) [20점]
		 
			실행결과)
			숫자를 입력하시오.
			3
			3의 배수
			
			실행결과)
			숫자를 입력하시오.
			7
			3의 배수 아님
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		int x = sc.nextInt() % 3;
		
		switch (x) {
			case 0:
				System.out.println("3의 배수");
				break;
			default:
				System.out.println("3의 배수 아님");
		}
		sc.close();
	}
	
	public static void p3() {
		/* 
		 * 9. 컴퓨터와 가위바위보 게임을 한다. 
		 * 컴퓨터는 가위, 바위, 보 중 임의로 선택한다. 
		 * (Math.random()함수 사용할 것) 
		 * 게임의 결과에 따라 승패를 알려준다. [20점]

			실행결과)
			가위 바위 보 중 하나를 고르시오. (1. 가위, 2. 바위, 3. 보)
			1
			나: 1
			컴퓨터: 1
			무승부
			
			실행결과)
			가위 바위 보 중 하나를 고르시오. (1. 가위, 2. 바위, 3. 보)
			3
			나: 3
			컴퓨터: 2
			나 승
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 중 하나를 고르시오. (1. 가위, 2. 바위, 3. 보)");
		int input = sc.nextInt();
		
		int com = (int) (Math.random() * 3) + 1;
		System.out.println("나: " + input);
		System.out.println("컴퓨터: " + com);
		
		if (input == com) {
			System.out.println("무승부");
		} else if ((input == 1 && com == 3) || (input == 2 && com == 1) || (input == 3 && com == 2)) {
			System.out.println("나 승");
		} else {
			System.out.println("컴퓨터 승");
		}
		
		sc.close();
		
	}
	
	public static void p4() {
		/* 
		 * 20 미만의 홀수 출력
		 * while과 for를 사용하여 각각 작성할 것
		 */
		
		int i = 1;
		
		while (i < 20) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("=============");
		
		for (int j = 1; j < 20; j+=2) {
			System.out.println(j);
		}
	}

	public static void p5() {
		/*
		 * 1부터 10까지의 합을 차례대로 출력
		 * while과 for를 사용하여 각각 작성할 것
		 */
		int sum = 0;
				
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(sum);
		}
		
		System.out.println("=============");
		
		sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i;
			System.out.println(sum);
			i++;
		}
	}
	
	public static void p6() {
		/*
		 * • 앞의 예제를 다음과 같이 출력하도록 바꿔보시오.
			- 숫자 하나를 입력받아서 입력받은 수까지의 합을 아래와 같이 구해 보시오. 
			(While/For를 사용하여 각각 만들 것)
			
			<실행결과>
			숫자를 입력하시오: 9
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오: ");
		int input = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			System.out.print(i);
			if (i < input) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("=============");
		
		sum = 0;
		int i = 1;
		while (i <= input) {
			System.out.print(i);
			if (i < input) {
				System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		sc.close();
	}
	
	public static void p7() {
		/*
		 * 숫자를 입력받아서 이전에 입력한 수보다 큰 수가 입력되면 다시 입력받고 
		 * 이전에 입력한 수보다 같거나 작은 수가 입력되면 종료하시오.
			맨 처음 입력할 때는 이전에 0이 입력되어 있다고 가정하고 풀 것		
			<실행결과>	
			Plaintext
			숫자를 입력하시오. 5
			숫자를 입력하시오. 10
			숫자를 입력하시오. 13
			숫자를 입력하시오. 7
			종료
		 */
		
		Scanner sc = new Scanner(System.in);
		int std = 0;
		
		while (true) {
			System.out.print("숫자를 입력하시오. ");
			int input = sc.nextInt();
			
			if (input <= std) {
				System.out.println("종료");
				break;
			}
			std = input;
		}
		sc.close();
		
	}
	
	public static void p8() {
		/*
		 * 변수를 1부터 1씩 증가시키며 출력하다가 5가 되면 종료하시오.	
			while문과 break를 사용할 것
		 */
		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
			if (i > 5) {
				break;
			}
		}
	}
	
	public static void p9() {
		/*
		 * 1부터 10까지의 수를 인쇄하다가 3의 배수가 되면 건너 뛰시오.
			for문과 continue를 사용할 것
		 */
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");	
		}
	}
	
	public static void p10() {
		/*
		 * 아래와 같이 출력해보시오.
			1 1 1 1 1
			2 2 2 2 2
			3 3 3 3 3
			4 4 4 4 4
			5 5 5 5 5
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
	}
	
	public static void p11() {
		/*
		 * 아래와 같이 출력해보시오.
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
			1 2 3 4 5
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
	}
	
	public static void p12() {
		/*
		 * 정수 하나를 입력받아서 소수인지 아닌지 판별해보시오.
		 * 단, “은”과 “는”이 구별되어 출력되어야 함.
		 * 실행결과)
		 * 12
		 * 12는 소수가 아닙니다.
		 */
		
	}
	
	public static void p13() {
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 */
		
	}
	
	public static void p14() {
		/*
		 * 
		 */
		

	}

	public static void p15() {
		/*
		 * 두 수를 입력받아서 공약수를 모두 출력해 보시오. 
		 * 예시) 두 수를 입력하시오: 30 20 -> 공약수: 1 2 5 10 
		 * 30과 20의 공약수는 4개입니다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cnt = 0;
		System.out.print("공약수: ");
		for (int i = 0; i < Math.min(a,  b); i++) {
			if ((a % i == 0) && (b % i == 0)) {
				System.out.print(i + " ");
				cnt += 1;
			}
		}
		System.out.println(a + "과" + b + "의 공약수는 " + cnt + "개입니다.");
		
		sc.close();
	}

	public static void p16() {
		/*
		 * 두 수를 입력받아서 최소공배수와 최대공약수를 구하시오. 
		 * 예시) 두 수를 입력하시오: 30 20 -> 최소공배수: 60, 최대공약수: 10 
		 */
	}

	public static void p17() {
		/*
		 * 정수형 변수 a, b, c를 선언하고 임의의 값을 입력한 뒤 합을 계산하여 별도의 변수에 저장하고 출력.
		 */
	}

	public static void p18() {
		/*
		 * 정수형 변수 a, b, c를 선언하고 임의의 값을 입력한 뒤 
		 * 합을 계산하여 별도의 변수에 저장하고 출력. 
		 */
	}

	public static void p19() {
		/*
		 * 2차 다항식(y = ax^2 + bx + c)에서 a, b, c가 각각 3, 4, 5이고 
		 * x가 2일 때 y값을 출력하는 코드를 작성하시오. 
		 */
	}

	public static void p20() {
		/*
		 * 정수형 변수 a를 선언하고 Math.random() 함수와 형변환을 활용하여 
		 * a에 0부터 9사이의 임의의 정수값이 할당되도록 해보자. 
		 */
	}

	public static void p21() {
		/*
		 * 국어, 영어, 수학 점수를 입력받으면 총점과 평균을 출력하시오. 
		 * - 국어, 영어, 수학, 총점은 정수형 변수로 처리 
		 * - 평균은 실수형으로 처리 (90, 100, 85 입력 시 91.666... 출력) 
		 */
	}

	public static void p22() {
		/*
		 * 문자형 변수 c1과 c2에 각각 'a'와 'z'를 할당한 뒤 
		 * c1이 c2보다 알파벳순으로 앞선 것이 맞는지 참/거짓을 출력하시오. 
		 */
	}

	public static void p23() {
		/*
		 * 난수를 만들어 0 이상 100 미만의 정수로 바꾼 뒤 
		 * 70 이상이면 '상', 40 이상이면 '중', 40 미만이면 '하'를 출력하시오. 
		 */
	}

	public static void p24() {
		/*
		 * 숫자 세 개를 입력받고 그 중 가장 큰 수를 출력하시오. 
		 */
	}

	public static void p25() {
		/*
		 * 난수를 만들어 0 이상 100 이하의 정수로 바꾼 뒤 
		 * 90 이상 A, 80 이상 B, 70 이상 C, 70 미만 F를 출력하시오. 
		 */
	}

	public static void p26() {
		/*
		 * 문자열을 입력받아서 값이 "Korea"/"korea"인 경우 "대한민국", 
		 * "China"/"china"인 경우 "중국", "Vietnam"/"vietnam"인 경우 "베트남" 출력 
		 * 그 외의 경우 "해당없음" 출력 
		 */
	}

	public static void p27() {
		/*
		 * 사용자로부터 'A'~'Z' 중 하나를 입력받고 컴퓨터도 임의의 문자 하나를 생성하여 
		 * 두 문자를 비교하여 사전 순으로 나열하도록 한다. 
		 * 예시) 나: D, 컴퓨터: G -> 출력: DG 
		 */
	}

	public static void p28() {
		/*
		 * 월(month) 값을 가진 변수의 값에 따라 마지막 일자를 출력하시오. 
		 * (9 입력 시 30, 10 입력 시 31 출력 / 1~12 외에는 "잘못된 값" 출력) 
		 * (2월은 28일로 가정) 
		 */
	}

	public static void p29() {
		/*
		 * 연도를 입력받아 윤년인지 아닌지를 출력하시오. 
		 * (4로 나누어 떨어지면 윤년, 100으로 나누어 떨어지면 아님, 400이면 윤년) 
		 * 테스트 케이스: 2023, 2020, 2100, 2000 
		 */
	}

	public static void p30() {
		/*
		 * 숫자 5개를 입력받고 최소값과 최대값을 출력하시오. 
		 * 예시) 입력: 5 2 10 8 20 -> 최소: 2, 최대: 20 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			
			if (input > max) {
				max = input;
			}
			if (input < min) {
				min = input;
			}
		}
		System.out.println("최소: " + min + ", 최대: " + max);
		
		sc.close();
	}

	public static void p31() {
		/*
		 * 1부터 입력받은 수 사이에 있는 홀수만을 출력하되 
		 * continue를 반드시 사용하여 구현하시오. 
		 */
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int i = 1;
		
		while (i <= x) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		sc.close();
	}

	public static void p32() {
		/*
		 * 중첩 반복문을 사용하여 아래와 같이 출력해보시오. 
		 * 1 2 3 4 5
		 * 2 3 4 5
		 * 3 4 5
		 * 4 5
		 * 5 
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j + 1 >= 6) {
					break;
				}
				System.out.print(i + j + 1 + " ");
			}
			System.out.println();
		}
	}

	public static void p33() {
		/*
		 * 중첩 반복문을 사용하여 별 패턴을 출력하시오. 역삼각형 형태
		 * * * * * *
		 *   * * * * 
		 *     * * *
		 *       * * 
		 *         *
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i > j) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void p34() {
		/*
		 * 왼쪽 위에서 오른쪽 아래로 대각선 별 출력
		 */
	}

	public static void p35() {
		/*
		 * 과목명(국어, 영어, 수학, 과학)과 점수(100, 80, 90, 95) 배열을 각각 만들고 
		 * 과목명을 입력하면 점수가 출력되게 하시오. ("그만" 입력 시 종료)
		 * 인덱스를 이용해보겠슨 
		 */ 
		
		String[] subjects = {"국어", "영어", "수학", "과학"};
		int[] scores = {100, 80, 90, 95};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("과목명을 입력하시오. ");
			String input = sc.next();
			
			if (input.equals("그만")) {
				break;
			}
			
			for (int i = 0; i < subjects.length; i++) {
				if (input.equals(subjects[i])) {
					System.out.println(scores[i]);
				}
			}
		}
		sc.close();
		
	}

	public static void p36() {
		/*
		 * 크기가 30인 배열에 피보나치 수열을 저장하고 출력해보시오. 
		 * (1, 1, 2, 3, 5, 8, 13, 21 ...) 
		 */
		
		int[] arr = new int[30];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public static void p37() {
		/*
		 * 아래 2차원 배열을 정의하고 각 방의 값을 반복문을 통해 할당한 뒤 출력하시오. 
		 * 1 2 3 4
		 * 2 4 6 8
		 * 3 6 9 12 
		 */
		
		int[][] arr = new int[3][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (j + 1) * (i + 1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void p38() {
		/*
		 * 네 명 학생의 이름과 국, 영, 수 점수를 입력받아 별도의 배열에 저장하고 
		 * 총점, 평균과 함께 표 형태로 출력하시오. 
		 */
	}

	public static void p39() {
		/*
		 * 알파벳을 계속 입력받아 사전순으로 가장 빠른 것을 출력하시오. 
		 * ("quit"를 입력하면 종료) 
		 */
	}

	public static void p40() {
		/*
		 * 두 개의 정수를 입력받아 두 수 사이 모든 숫자의 평균을 계산하시오. 
		 * (숫자 크기 순서 고려, 실수값 출력) 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		double cnt = Math.abs(b - a) + 1;
		
		for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			sum += i;
		}
		System.out.println(sum / cnt);
		
		sc.close();
	}

	public static void p41() {
		/*
		 * 이중 For 문을 사용하여 아래 패턴을 배열에 할당하고 출력하시오. 
		 * 1 3 5 7 9
		 * 2 4 6 8 10
		 * 3 5 7 9 11
		 * 4 6 8 10 12
		 * 5 7 9 11 13
		 */
		
		int[][] arr = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) + (2 * j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void p42() {
		/*
		 * 1부터 10 사이의 임의의 숫자를 생성하고 이를 맞추는 코드를 작성하시오. 
		 * (크다/작다 힌트를 주며 맞출 때까지 반복) 
		 */
		Scanner sc = new Scanner(System.in);
		
		int rand = (int) (Math.random() * 10) + 1;
		
		while (true) {
			int input = sc.nextInt();
			
			if (rand > input) {
				System.out.println("정답보다 작다");
			} else if (rand < input) {
				System.out.println("정답보다 크다");
			} else {
				System.out.println("정답");
				break;
			}
		} 
		sc.close();
	}

	public static void p43() {
		/*
		 * 배열 arr에 다섯 개의 값(10, 20, 30, 40, 50)을 저장하고 
		 * 반복문을 활용하여 다섯 개 값의 합을 구하시오. 
		 */
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

	public static void p44() {
		/*
		 * 출력 예시)
		 * 00 01 02 03 04
		 * 10 11 12 13
		 * 20 21 22
		 * 30 31
		 * 40
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j ++) {
				System.out.print("" + i + j + " ");	
			}
			System.out.println();
		}
	}

	public static void p45() {
		/*
		 * 출력 예시)
		 * * * 1 * *
		 * * * 2 * *
		 * 1 2 3 4 5
		 * * * 4 * *
		 * * * 5 * *
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 2) {
					System.out.print(i + j - 1 + " ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void p46() {
		/*
		 * 출력 예시)
		 * 1 * * * 1
		 * * 2 * 2 *
		 * * * 3 * *
		 * * 4 * 4 *
		 * 5 * * * 5
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i - j == 0 || i + j == 4) {
					System.out.print(i + " ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void p47() {
		/*
		 * 출력 예시)
		 * O O O O O
		 * X X X X
		 * O O O
		 * X X
		 * O
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j <= 4) {
					if (i % 2 == 0) {
						System.out.print("O ");
					} else {
						System.out.print("X ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void p48() {
		/*
		 * 주어진 배열 {10, 20, 30, 50, 3, 60, -3}에서 
		 * 최대값과 최소값을 찾아 출력하는 코드를 완성하시오. 
		 */
		
		int[] arr = {10, 20, 30, 50, 3, 60, -3};
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

	public static void p49() {
		/*
		 * 문자 배열 {'a', 'b', 'c', 'd'}에서 n을 입력하면 
		 * array[n] 번째 원소를 출력해 주는 코드를 작성하시오. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char[] arr = {'a', 'b', 'c', 'd'};
		
		int idx = sc.nextInt();
		
		System.out.println(arr[idx]);
		
		sc.close();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
