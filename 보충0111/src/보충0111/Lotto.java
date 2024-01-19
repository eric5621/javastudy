package 보충0111;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 중복없이 숫자 6개 뽑기
		int[] roto = new int[6];

		// 랜덤 값으로 배열에 값 담아주기
		Random ran = new Random();

		for (int i = 0; i < roto.length; i++) {
			roto[i] = ran.nextInt(45)+1;
			// roto[2] = ran.nextInt;
			// 앞서 뽑은 숫자와 비교하는 반복문
			for (int j = 0; j < i; j++) {
				if (roto[j] == roto[i]) {
					// 앞서 뽑은 숫자와 같은 수가 있다면
					// 다시 뽑기 위해서 인덱스 값을 1 감소 시킨다
					i--;
				}
			}
		}System.out.println(Arrays.toString(roto));
	}	
	
}
