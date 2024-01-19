package Exwhile문;

import java.util.Scanner;

public class Ex02while예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
//        while (num < 10) {
//			System.out.println("정수 입력 : ");
//			num = sc.nextInt();
//			num++;
//		}
//        System.out.println("종료되었습니다.");
		
		
		// 무한 반복문 조건은 무조건 참이며 거짓으로 줄수가없다
		while(true) {
			System.out.println("정수 입력 : ");
			num = sc.nextInt();
			if(num>=10) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
		
		
		
		
	}
	
}
