package 자바페스티벌;

import java.util.Scanner;

public class ex12번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int cnt = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[j][i] = cnt++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(array[i][j] + "\t");
			}
		}	System.out.println();

	}

}
