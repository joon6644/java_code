package homework;

public class Week04_01 {

	public static void main(String[] args) {
		System.out.println("60250770 전준태");
		
		int score = (int) (Math.random() * 101);
		String grade;
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		}	else {
			grade = "F";
		}
		
		System.out.println("점수: " + score);
		System.out.println(grade);
	}

}
