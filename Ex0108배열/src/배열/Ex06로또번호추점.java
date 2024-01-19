package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추점 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[5];

		// 2. lotto의 1번방 데이터를 랜덤한 수로 초기화
		for (int j = 0; j < 5; j++) {
			lotto[j] = ran.nextInt(10) + 1;
			for (int i = 0; i < j; i++) {
				if (lotto[i] == lotto[j]) {
					j--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
