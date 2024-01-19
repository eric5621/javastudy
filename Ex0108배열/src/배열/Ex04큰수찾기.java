package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04큰수찾기 {

	public static void main(String[] args) {
		// 1. 정수형 데이터 5개를 저장하는 배열 선언
		int[] array = new int[5];
		// 2. 랜덤한 숫자로 배열 초기화하기
		Random ran = new Random();
		// 3. 가장 큰 수를 선언하는 변수 max 선언
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			array[0] = ran.nextInt(10) + 1;
		}
		// 4. max와 배열 안에 들어있는 값 비교(0번 인덱스부터)
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				// 5. 만약 배열안에 들어있는 값이 max보다 크다면
				// max를 배열안에 있는 값으로 변경하기
				max = array[i];
			}
		}
		// 6. 배열안의 모든 값을 출력하기
		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(array));
		// 7. 가장 큰 값을 출력하기
		System.out.println("가장 큰 값은 " + max + "입니다.");

	}

}
