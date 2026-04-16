package midterm;

public class Prob7_4 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(((i + j + 1) % 2) + " ");
			}
			System.out.println();
		}
	}

}
