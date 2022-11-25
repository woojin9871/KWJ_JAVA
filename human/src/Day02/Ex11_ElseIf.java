package Day02;

import java.util.Scanner;

public class Ex11_ElseIf {
	public static void main(String[] args) {
		// 도전
		// 정수를 하나 입력받아서, 
		// 90 이상이면 A
		// 80 이상이면 B
		// 70 이상이면 C
		// 60 이상이면 D
		// 60 미만이면 F
		// 학점을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
			 
		System.out.println("점수 : ");
		String result = "";
		int input = sc.nextInt();
		
		if (input >= 90) 
			result = "A";
		
		else if(input >= 80) 
			result = "B";
		
		else if(input >= 70) 
				result = "c";
		
		else if(input >= 60) 
				result = "D";
		
		else if(input <= 60) 
				result = "F";
				
		System.out.println("학점은 " + result + "입니다.");
					
		sc.close();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
