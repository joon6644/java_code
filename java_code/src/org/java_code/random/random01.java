package org.java_code.random;

public class random01 {
	public static void main(String[] args) {
		// 4, 5, 6 중 임의로 한 숫자를 출력
		int a = (int) (Math.random() * 3) + 4; // 0~1을 0~3으로 스케일링 후 4를 더해줌
		System.out.println(a);
	}
}
