package Day07.Ex04_StaticMenber;

public class SingleTon {

	private static SingleTon instance  = new SingleTon();
	
	// 생성자를 private 으로 정의
	private SingleTon() {
		
	}
	
	// 인스턴스
	// 이미 생성되어 있으면, 생성된 인스턴스를 반환한다.
	public static SingleTon getInstance() {
		if( instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
	
}
