package 보충0111;

public class Ex01 {

	public static void main(String[] args) {
		// for : 반복 횟수가 정해져 있을때 (~언제부터 언제까지)
		// i=0 i<3 i++ 0
		// i=1 i<3 i++ 1
		// i=2 i<3 i++ 2
		// i=3 i<3 i++ 3 조건부를 끝내기 위해서는 false가 되어야한다.
//		for (int i = 0; i < 3; i++) {
//			System.out.println(i);

		// 1부터 9까지 출력 시켜주세요.
		// 구구단 2단을 출력 시켜주세요!
		// 2 4 6 8 10 12 14 16 18
		// 2*1
		// 2*2
		// 2*3
		// 2*4
		// 2*5
		// 2*6
		// 2*7
		// 2*8
		// 2*9

//		System.out.println("10"+10); //1010-->문자열

//		for (int i = 1; i < 10; i++) {
		// System.out.println(2*i);
//			int result = 2*i;
//			System.out.println(2+"*"+i + "=" + result);
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum = sum - i;
				System.out.println(-i);
			} else {
				sum = sum + i;
				System.out.println(i);
			}
		}

		System.out.println("결과 : " + sum);

	}

}
