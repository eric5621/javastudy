package Ex월급계산프로그램;

public class TempEmployee extends Employee {

	
	// 2. 메소드
	// 생성자, getmoneypay, print
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}
	
	public int getMoneyPay () {
		return pay / 12;
	}
	
	
	
	
}
