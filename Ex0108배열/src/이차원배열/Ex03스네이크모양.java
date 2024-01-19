package 이차원배열;

import java.util.Iterator;

public class Ex03스네이크모양 {

	public static void main(String[] args) {

		// 1. 5행 5열 이차원 배열 생성하기
		int[][] array = new int[5][5];
		// 2. 21로 시작하는 변수 num 선언하기
		int num = 21;
		// 3. 스네이크 모양으로 데이터 저장하기
		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			}

		}
		//
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
	}
}