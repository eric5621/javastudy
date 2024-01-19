package 이차원배열;

public class 이차원배열문제풀이 {

	public static void main(String[] args) {

		// 1. 5행 5열 이차원 배열 생성하기
		int[][] array = new int[5][5];
		// 2. 21부터 시작하는 변수 num 만들기
		int num = 21;
		// 3. 열부터 데이터가 저장될 수 있도록 코드 작성

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;

			}

		}
		// 4. 행부터 데이터가 출력될 수 있도록 코드 작성(왼쪽부터 오른쪽 방향)
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i][j] + "\t");
			}

		}
		System.out.println();

	}

}
