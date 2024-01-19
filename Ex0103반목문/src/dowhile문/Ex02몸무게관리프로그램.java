package dowhile문;

import java.util.Scanner;

public class Ex02몸무게관리프로그램 {

	public static void main(String[] args) {
		// int kg1 = 0;
		// int kg2 = 0;
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 입력받기
		System.out.print("현재 몸무게 : ");
		// kg1 = sc.nextInt();
		int now = sc.nextInt();
		// 3. 목표 몸무게 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		// kg2 = sc.nextInt();
		// 4. 주차별 감량 몸무게 입력받기
		// ---> 언제 다이어트를 성공할지 모름! 주차도 변수 선언하기
		int week = 1;
		do {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
//		int num = 1;
//		do {
//			System.out.print(num +"주차 감량 몸무게 : ");
//			int input = sc.nextInt();
//			num++;
//			

			// } while(true);

			// 5-1. 현재 몸무게 = 원래 몸무게 - 감량 몸무게(변수 더 만들필요 X)
			now -= minus;
			// 5-2. 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
			if (now <= goal) {
				System.out.println(now + "kg 달성!! 축하합니다!!");
				break;
			}
			// if (kg1
		} while (true);

	}

}
