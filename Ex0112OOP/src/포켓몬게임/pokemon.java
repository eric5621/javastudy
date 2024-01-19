package 포켓몬게임;

public class pokemon {
	// 이름, 체력, 공격력, 기술, 타입
	private String name;
	private int hp;
	private int atk;
	private String skill;
	private String type;
	// 모든 필드를 초기화 할 수 있는 생성자 생성
	
	public pokemon(String name, int hp, int atk, String skill, String type) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp =hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	
	
	
	
	
	
}
