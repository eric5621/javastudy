package Ex월급계산프로그램;

public class payMain {

	public static void main(String[] args) {

		RegularEmployee regular = new RegularEmployee("0001", "임경남", 7000, 400);
		System.out.println(regular.print());

		TempEmployee Temp = new TempEmployee("0002", "김상원", 5000);
		System.out.println(Temp.print());

		PartTimeEmployee pe = new PartTimeEmployee("0003", "강규남", 30, 20);
		System.out.println(pe.print());

	}

}
