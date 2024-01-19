package Ex월급계산프로그램;

public class PartTimeEmployee extends Employee {
	
	private int workDay;
	
	// 2. 메소드
	// 생성자, getMoneyPay,print
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	public int getMoneyPay () {
		return pay * workDay ;
	}
	
	
	
	
	
	
	
	
}
