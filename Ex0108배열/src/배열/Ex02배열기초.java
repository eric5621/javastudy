package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		// 배열의 길이
		// 변수명.length;

		int length = numbers.length;
		System.out.println("배열의 길이 : " + length);

		// 배열의 각 칸을 5의 배수로 초기화해 주세요.

		numbers[0] = 5;
		System.out.println(numbers[0]);
		numbers[1] = 10;
		System.out.println(numbers[1]);
		numbers[2] = 15;
		System.out.println(numbers[2]);
		numbers[3] = 20;
		System.out.println(numbers[3]);
		numbers[4] = 25;
		System.out.println(numbers[4]);

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 * (i + 1);
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}

		System.out.println();

		// 배열과 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = { "김상원", "이도연", "정대주" };
		System.out.println(names[1]);
	}

}
