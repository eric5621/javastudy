package 자바페스티벌;

import java.util.Scanner;

public class Ex3회차문제 {

	public static void main(String[] args) {

		int sum = 0 ;
		for(int i = 1; i <101; i++)
		if(i%2==1) {
			sum = sum+i;
			System.out.print(i+" ");
		} else {
			sum = sum - i ;
				System.out.print("-"+i+" ");
		}
		System.out.println();
		System.out.println("결과 : " + sum);
		
		
		
		
		
		
		
		
	}

}
