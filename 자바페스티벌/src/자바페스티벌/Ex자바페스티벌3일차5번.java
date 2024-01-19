package 자바페스티벌;

import java.util.Scanner;

public class Ex자바페스티벌3일차5번 {

	public static void main(String[] args) {

		// 8자리 정수를 입력받아 반복문을 활용하여
		// 입력받는 정수의 합을 구하여 출력하는 프로그램

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < 8 ; i++) {
			sum += num % 10;
			num = num / 10 ;
		} System.out.println("합은 " + sum + "입니다.");
	}

}
