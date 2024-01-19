package Ex0102다중if문;

import java.util.Scanner;

public class Ex02학점계산프로그램 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		
		int num = Sc.nextInt();
		
		if(num>=90) {
			System.out.println("A학점입니다.");
		} else if (num>=80) {
			System.out.println("B학점입니다.");
		} else if (num>=70) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}
		
		
		
		
		
		
		
		
		
	}

}
