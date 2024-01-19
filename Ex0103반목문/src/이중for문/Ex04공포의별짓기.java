package 이중for문;

public class Ex04공포의별짓기 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		for(int j = 1; j < 6; j++) {
			for (int i = 0; i < 5-j; i++) { // 4-3-2-1-0
				System.out.print(" ");
		}
			for (int i = 0; i < j; i++) { // 1-2-3-4-5
			System.out.print("*");
		}
		System.out.println();

		}
	}
}
