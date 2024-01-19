package 배열;

import java.util.Random;

public class Ex03배열풀이 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 array 선언
		int[] array = new int[5];
		// 2. 랜덤한 값으로 배열 값 초기화(1~100)
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
		}
		// 3. 홀수값만 출력하고, 총 몇개인지 출력
		System.out.print("array에 들어있는 홀수는 ");
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				// 홀수일 때
				System.out.print(array[i] + " ");
				num++;
			}
		}
		System.out.println("이며, ");
		System.out.println("총 " + num + " 개입니다.");
	}

}
