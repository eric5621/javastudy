package 자바페스티벌;

import java.util.Scanner;

public class Ex문제4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 >> ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력 >> ");
		int b = sc.nextInt();
		
		int c = 0;
		c = b % 10 ;
		int d = 0;
		d = b % 100 / 10 ;
		int e = 0;
		e = b / 100 ;
		
		
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(a*b);
		
		
		
		
		
		
		
		
	}

}
