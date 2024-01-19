package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class Ex4회차문제2번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();

		for (int i = row; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
