package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {

		//int num = 1;
		//int su = 0;
		//for(int i = 77 ; i >= 1; i--) {
		//su = su + (i*num) ; 
		//num++;
		//}
		
		// (77*1)+(76*2)+(75*3) 을 계산하여 결과 출력
		int sum = 0;
		int num = 1;
		for(int i = 77 ; i > 0; i--) { // i : 77 --> 1
			sum += (i*num); // num : 1 -->77
			num++;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

}
