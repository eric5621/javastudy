package 자바페스티벌;

public class Ex자바페스티벌6번문제 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i < 78; i++) {
			sum = sum + (i * (78 - i));
		}
		System.out.println(sum);
	}

}
