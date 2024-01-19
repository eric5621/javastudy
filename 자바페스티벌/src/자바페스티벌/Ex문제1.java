package 자바페스티벌;

import java.util.Scanner;

public class Ex문제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		
		int time = sc.nextInt();
		int money = 5000;
		if(time > 8) {
			money = (int) (8 * 5000 + (time-8) * 5000 * 1.5) ;
			System.out.println("총 임금은 " + money + "원 입니다.");
		} else {
			money = 8 * 5000 ;
			 
		}
		
		
		
		
		
		
	}

}
