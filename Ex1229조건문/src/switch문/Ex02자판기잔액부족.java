package switch문;

import java.util.Scanner;

public class Ex02자판기잔액부족 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요. >> ");
		
		int money = sc.nextInt();
		
		System.out.print("메뉴를 고르세요. 1.아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원) >>" );
		
		int menu = sc.nextInt();
	
	    
	    switch (menu) {
	    case 1 : 
	    	menu = money - 700;
	    	break ;
	    case 2 : 
	    	menu = money - 1000;
	    	break ;
	    case 3 : 
	        menu = money - 500;
	    	break ;
	    } 
	 
	    
	    if (menu>=0) {
	    	System.out.println("잔돈은 " + menu + " 원 입니다. ");
	    
	    } else {
	    	System.out.println("돈이 부족해요ㅠㅠ");
	    	System.out.println("잔돈은 "  + money + " 원 입니다. ");
	    }
		
	    System.out.println("잔돈은 " + money + "원 입니다.");
	    
	    System.out.println("천원");
		
		
		
		
		
		
		
	}

}
