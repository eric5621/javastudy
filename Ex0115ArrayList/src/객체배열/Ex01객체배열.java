package 객체배열;

public class Ex01객체배열 {

	public static void main(String[] args) {
		// 1. 객체 배열 생성
		// 자료형 [] 변수명 = new 자료형[칸수];
		// 포켓몬 자료형 3개를 보관할 수 있는 배열 생성

		// pokemon[] bag = new pokemon[3];
		
		pokemon[] bag = new pokemon[5];
		
		bag[0] = new pokemon();

		// 객체 배열의 0번방 출력

		System.out.println("배열의 0번방 : " + bag[0]);

		// 객체 배열의 0번 방에 포켓몬을 넣어보자!
		// 피카츄 / 전기 / 백만볼트 / 100 / 15

//		pokemon pika = new pokemon("피카츄", 100, 15,"백만볼트","전기");
//		
//		bag[0] = pika;
//		

		bag[0] = new pokemon("피카츄", 100, 15, "백만볼트", "전기");
		// bag의 1번방 >> 파이리 / 불 / 화염방사 / hp : 90 / atk : 12
		bag[1] = new pokemon("파이리", 90, 12, "화염방사", "불");
		// bag의 2번방 >> 꼬부기 / 물 / 물대포 / hp: 88 / atk : 14
		bag[2] = new pokemon("꼬부기", 88, 14, "물대포", "물");
		// 배열 안에 들어있는 이름, 타입 , hp를 전부 출력해주세요
		// =====포켓몬 정보 출력=====
		// 피카츄 전기 100
		// 파이리 불 90
		// 꼬부기 물 88
		System.out.println("=====포켓몬 정보 출력=====");
		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + bag[i].getType() + bag[i].getHp());

		}

		// for-each문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작 원리
		// 배열안에 저장되어있는 데이터를 포문에서 순차적으로 꺼내서
		// :(콜론) 기준으로 왼쪽에 있는 변수에 담아주는 흐름을 가지고 있다.
		for (pokemon p : bag) {
			System.out.println(p.getName() + "\t" + p.getType() + "\t" + p.getHp());
		}

	}

}
