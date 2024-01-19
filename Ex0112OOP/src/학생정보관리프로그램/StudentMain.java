package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {

		// Student 자료형 stu1 객체 생성
		Student stu1 = new Student();

		stu1.setname("임경남");

		stu1.setNumber("20220458");

		stu1.setage(20);

		stu1.setscoreJava(50);

		stu1.setscoreWeb(99);

		stu1.setScoreAndroid(77);

		// 이름, 자바 점수 출력

		System.out.println(stu1.getname());
		System.out.println(stu1.getscoreJava());
		// 메소드 이름 위에 마우스 올려서 포스트잇 모양이 뜨면
		// 초록색 동그라미 오른쪽에 있는 자료형이 리턴타입을 의미한다.
		
		// Student 자료형 stu2 객체 생성
		
		Student stu2 = new Student("임경만","20242222",19);
		// new Student() ---> 객체를 생성하는 순간에 실행되는 메소드!
		// ****생성자(constructor)****
	}

}
