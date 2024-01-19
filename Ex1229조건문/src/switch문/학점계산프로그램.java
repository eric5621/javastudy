package switch문;

import java.util.Scanner;

public class 학점계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		
		int totalScore = sc.nextInt();
		char grade = 'A';
		switch (totalScore/10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default:
		    grade = 'D';
		    break;
			
		}
		System.out.println(grade+"학점입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
