package midterm2;

public class practice2 {

    public static void main(String[] args) {

        char[][] arr = new char[5][5];

        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
        		if ((i + j) % 2 == 0) {
                    arr[i][j] = '*';
                } else {
                	arr[i][j] = ' ';
                }
        	}
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
