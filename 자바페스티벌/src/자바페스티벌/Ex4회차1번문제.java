package 자바페스티벌;

import java.util.Scanner;

public class Ex4회차1번문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int h = sc.nextInt();
		for (int j = 0; j < h; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

}
