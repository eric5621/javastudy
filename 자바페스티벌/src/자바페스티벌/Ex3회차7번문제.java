package 자바페스티벌;

import java.util.Scanner;

public class Ex3회차7번문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 정수 n을 입력받기

		int num = 1;
		System.out.print("입력 : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			num = num * i;
		}
		System.out.println("출력 : " + num);
	}

}
