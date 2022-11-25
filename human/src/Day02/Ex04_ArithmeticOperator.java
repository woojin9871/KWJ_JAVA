package Day02;

public class Ex04_ArithmeticOperator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		// 증감연산자
		// ++a, a++			: a를 1 증가
		// --a, a--			: a를 1 감소
		
		//후위연산자 : 연산 우선순위가 가장 낮다
		c = a++ + b;
		System.out.println("c =" + c);
		
		int x = 10;
		int y = 20;
		int z;
		
		//전의연산자 : 후의연산자 : 연산 우선순위가 가장 낮다
		z = ++x + y;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
	}
}
