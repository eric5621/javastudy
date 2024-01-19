package 자바페스티벌;

import java.util.Scanner;

public class Ex문제3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자 입력 : ");
	
	int n = sc.nextInt();
	
	int num = 0;
	
	num = n % 10 ; 
	
	if (num <5  ) {
		n = n - num ;
	} else {
		n = n + (10-num);
	}
	System.out.println("반올림 수 : " + n);
	
		
		
		
		
		
		
		
		
		
	}

}
