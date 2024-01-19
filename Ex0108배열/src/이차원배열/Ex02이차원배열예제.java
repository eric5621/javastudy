package 이차원배열;

public class Ex02이차원배열예제 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num + (i * 5);
				System.out.print(array[i][j] + "\t");
			}
			num++;
			System.out.println();
		}

	}

}
