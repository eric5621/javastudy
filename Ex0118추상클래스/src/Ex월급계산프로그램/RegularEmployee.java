package Ex월급계산프로그램;

public class RegularEmployee extends Employee {

	private int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	// getMoneyPay : 월 급여를 계산해서 리턴
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

	// print --> 사번 : 이름 : 연봉을 리턴
	

}
