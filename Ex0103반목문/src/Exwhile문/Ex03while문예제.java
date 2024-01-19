package Exwhile문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		while (num >= -1) {
			System.out.println("정수 입력");
			
			num = sc.nextInt();
			
			sum = sum + num;
			
			System.out.println("누적 결과 : " + sum);
			
			if(num==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
