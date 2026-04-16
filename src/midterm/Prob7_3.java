package midterm;

public class Prob7_3 {

	public static void main(String[] args) {
		
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j <= 4) {
					System.out.print((char) ('A' + cnt++) + " ");
				}
			}
			System.out.println();
		}
	}

}
