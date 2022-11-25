package Day10.Ex01_TryCatch;

import java.util.Scanner;

public class DevideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;		// 피제수
		int b;		// 제수
		
		System.out.println("a 입력 : ");
		a = sc.nextInt();

		System.out.println("b 입력 : ");
		b = sc.nextInt();
		
		// 예외 메세지 : java.lang.ArithmeticException: / by zero 
		try {
		//예외 발생가능성 있는 문장
		System.out.println("a / b = " +  a / b);		
		}
		catch(ArithmeticException e ) {
			// 예외 발생 시, 예와 처리 문장
			System.out.println("0으로 나눈 것은 수학적으로 정의되지 않습니다");
		}
		// fiannly 블록은 생략 가능
		finally {
			// 예외 발생 여부와 관계없이 실행할 문장
			// 예외 처리와 관령한 문장을 작성(자원 해제하는 문장 등을 작성)
			sc.close();
		}
	}
}
