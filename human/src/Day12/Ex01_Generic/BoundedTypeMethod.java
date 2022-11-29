package Day12.Ex01_Generic;

public class BoundedTypeMethod {

	// 제네릭 메소드 타입 제한
	// Number
	// - 자식 클래스 : Integer, Double 등의 래퍼클래스 외 다수
	public <T extends Number> void methid(T t) {
		// 넘어온 어떤 타입이든 정수로 변환
		// 타입을 Number 로 한정했기 때문에,
		// Number 클래스의 메소드를 호출이 가능하다
		System.out.println(t.intValue());
	}

	public static void main(String[] args) {
 
		BoundedTypeMethod btm = new BoundedTypeMethod();
		btm.methid(1234.5678);
	}
}
