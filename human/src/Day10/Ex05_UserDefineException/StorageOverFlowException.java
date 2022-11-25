package Day10.Ex05_UserDefineException;

// 사용자 정의 예외 클래스 선언
// public class ????Exception extend Exception
public class StorageOverFlowException extends Exception {

	public StorageOverFlowException() {
		
	}

	public StorageOverFlowException(String message) {
		super(message);
	}
}
