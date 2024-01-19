package 이중for문;

public class Ex02별찍기 {

	public static void main(String[] args) {

		
//		for(int i = 1; i < 6; i++) {
//			for(int j = 0 ; j < i; j++) {
//				System.out.print("*");
//					System.out.println();
//				
//			}
//		}
		
		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
	}

}
