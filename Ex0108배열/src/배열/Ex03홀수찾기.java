package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		Random ran = new Random();
		int c = 0;
		int[] array = new int[5];
		
		System.out.print("array에 들어있는 홀수는 ");
		for(int i = 0; i< array.length ; i++) {
			int ranNum = ran.nextInt(100)+1;
			array[i] = ranNum ;
			if(array[i] % 2 == 1) {
				System.out.print(array[i] +" ");
				c++;
			}
		}
		
		System.out.println("이며,");
		System.out.println("총 " + c + "개 입니다.");
		
		
		
		
	}
	
	

}
	
	
	

