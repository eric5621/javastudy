package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		int money = 0;
		// 지역 변수(local variable))****
		// : {} 중괄호 영역 안에서 선언된 변수는 {} 영역 안쪽에서만 사용이 가능하다.
		// ---> {} scope
		if(age < 20) {
	    money = (int) (5000 * people * 0.5) ;
		} else {
			int money2 = 5000 * people;
		}
	
		System.out.println("총" + money + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
	}

}
