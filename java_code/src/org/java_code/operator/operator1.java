package org.java_code.operator;

public class operator1 {

	public static void main(String[] args) {
		// 임의의 두 난수를 생성하여 대소 비교
		Double a = Math.random();
		Double b = Math.random();
		if (a > b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// 두 문자형 변수에 a, z를 할당 후 대소비교
		char c1, c2;
		c1 = 'a';
		c2 = 'z';
		
		boolean result = c1 < c2;
		System.out.println(result);
		
		// ==와 equals()
		String i = "aaa";
		String j = new String ("aaa"); // 괄호 필수
		boolean ans1 = i == j;
		boolean ans2 = i.equals(j);
		System.out.println(ans1);
		System.out.println(ans2);
		
		
	}

}
