package 자바페스티벌;

import java.util.Scanner;

public class Ex자바페스티벌1번문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.println("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 0;

		while (now >= goal) {
			week++;
			System.out.println(week + "주차 감당 몸무게 : ");
			int min = sc.nextInt();

			now = now - min;
		} System.out.println(now + "kg 달성!! 축하합니다!");
	}
	
}
