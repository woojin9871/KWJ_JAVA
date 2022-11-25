package Day02;

public class Ex02_Casting {
	
	public static void main(String[] args) {
		// 자동 타입 변환
		// (큰 데이터타입) = (작은 데이터타입);
		// : 작은 데이터타입을 큰 데이터타입으로 자동으로 타입을 변환
		float value1 = 3;
		long value2 = 5;
		double value3 = 7;
		byte value4 = 9;		// (예외) 저장 범위 내의 값일 떄는 예외적으로 자동변화 
		short value5 = 11;		// (예외) 저장 범위 내의 값일 떄는 예외적으로 자동변화 
		
		//강제 타입 변환
		//(작은 데이터타입) =(???) (큰 데이터타입)
		// : 변환할 데이터타입을 ()타입변환 연산자 안에 명시적으로 작성하여 타입을 변환 
		byte value6 = (byte) 128;
		int value7 = (int) 3.5;
		float value8 = (float) 7.5;
	
		
		System.out.println("value : " + value1);
		System.out.println("value : " + value2);
		System.out.println("value : " + value3);
		System.out.println("value : " + value4);
		System.out.println("value : " + value5);
		System.out.println("value : " + value6);
		System.out.println("value : " + value7);
		System.out.println("value : " + value8);
	}
}
