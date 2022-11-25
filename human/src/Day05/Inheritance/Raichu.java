package Day05.Inheritance;

// 상속 키워드 : 자식클래스 extends 부모 클래스
public class Raichu extends Pikachu {

	// 생성자 자동완성 단축키
	// Alt + Shift + S : C
	public Raichu() {
		super(200, "super-thunder");
	}
	public Raichu(int energy, String type) {
		super(energy, type);
	}
	
	// 메소드 오버라이딩 : 메소드 재정의
	@Override
	public String aAttack() {
		return "백만볼트";
	}
	@Override
	public String bArrack() {
		return "볼트체인지";
	}
		
}
