package Exwhile문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		int jjak = 0; // 짝수
		int hol = 0; // 홀수
		// 2. 정수 입력 출력하기
		while (true) {
			System.out.print("정수 입력 : ");
			// 3. 정수 입력받기
			int input = sc.nextInt();
			
			if (input % 2 == 0) {
			// 4. 입력받는 정수가 짝수라면 짝수의 개수를 + 1
			// ---> 짝수의 개수와 홀수의 개수를 구할 변수가 필요하다.
			jjak++;
			} 	else if (input % 2 == 1) {
			// 5. 입력받는 정수가 홀수라면 홀수의 개수를 +1
			hol++;
			} 	else if (input == -1) {
			System.out.println("종료되었습니다.");
			break;
			}
			System.out.println("짝수 개수 :"+ jjak);
			System.out.println("홀수 개수 :"+ hol);
		}
	}
	

}
