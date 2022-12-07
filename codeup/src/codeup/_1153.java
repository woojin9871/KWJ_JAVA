package codeup;

import java.util.Scanner;

public class _1153 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 공백을 두고 입력하시오.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if( a > b) { 
			System.out.println(">");
		
		}
		if( a < b) { System.out.println("<");
		
		}
		if ( a == b) { System.out.println("=");
		
		}
		
		sc.close();		
	}
}
