package Day08.Ex07_InterfaceExtends;

public class Example {

	public static void main(String[] args) {
		// 구현 객체 생성
		ImplementationC impl = new ImplementationC();		
		InterfaceA iA = impl;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		System.out.println();
		
		// Interface 는 InterfaceA, InterfaceB를 상속받은
		// methodA, methodB, methodC,
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		System.out.println();
	}
}
