package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요.");
		
		int money = sc.nextInt();
		
		System.out.print("메뉴를 고르세요. 1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) >> ");
		
		int snack = sc.nextInt();
		
		
		switch (snack) {
		case 1 :
	    System.out.println(money - 700 );
		break ;
		case 2 :
		System.out.println(money - 1000);
		break ;
		case 3 :
		System.out.println(money - 500);
		break ;
		default :
			System.out.println("잔돈"+ money + "원 입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
