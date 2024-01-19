package 자바페스티벌;

import java.util.Scanner;

public class Ex문제2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("총금액 입력 : ");
	
	int money = sc.nextInt();
	
	System.out.println("잔돈 : "+ money + "원");
	
	int a = 0;
	a = money / 10000 ;
	System.out.println("10000원 : " + a + "개");
	int b = 0;
	b = (money - a * 10000) / 5000 ;
	System.out.println("5000원 : " + b + "개");
	int c = 0;
	c = (money - a * 10000 - b * 5000 ) / 1000 ;
	System.out.println("1000원 : " + c + "개");
	int d = 0;
	d = (money - a * 10000 - b * 5000 - c * 1000) / 500 ;
	System.out.println("500원 : " + d + "개");
	int e = 0;
	e = (money - a * 10000 - b * 5000 - c * 1000 - e * 500) / 100;
	System.out.println("100원 : " + e + "개");	
		
		
		
		
		
	}

}
