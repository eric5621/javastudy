package 삼항연산자;

import java.util.Scanner;

public class 삼항연산자연습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num2 = 15 ;
	    int num1 = 24 ;
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = num2 < num1 ? "(은) 홀수입니다." : "(은) 짝수입니다.";
		System.out.println(num+result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
