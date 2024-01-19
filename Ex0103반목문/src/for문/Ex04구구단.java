package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 단 입력받기
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		// 3. 수 입력받기
		System.out.print("어느 수까지 출력 : ");
		int su = sc.nextInt();
		
		for(int i = 1; i <= su ; i++) {
			System.out.println(dan + "*"+i+"="+(dan*i));
		}
//		System.out.print("단 입력 :");
//		int num = sc.nextInt();
//		System.out.print("어느 수 까지 출력 : ");
//		int num2 = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++){
//			System.out.println("2*" + i + "=" + (2*1));}
//		System.out.println("2*2=(2*2)");
//		System.out.println("2*3=(2*3)");
		
		
		
		
		
		
		
		
		
	}

}
