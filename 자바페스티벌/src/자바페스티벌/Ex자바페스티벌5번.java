package 자바페스티벌;

import java.util.Scanner;

public class Ex자바페스티벌5번 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("행 개수 : ");
	int row = sc.nextInt();
	
	for(int i = 1; i <= row; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print("*");
		}
	}
	
	
	
	}

}
