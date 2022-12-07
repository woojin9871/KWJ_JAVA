package codeup;

import java.util.Scanner;

public class _1354 {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i >= input; i--) {
			for (int j = 1; j >= i; j--) {
				
				// i : 5, j : 1 2 3 4 5
				// i : 4, j : 1 2 3 4 
				// i : 3, j : 1 2 3 
				// i : 2, j : 1 2
				// i : 1, j : 1
				
				
				System.out.print("*");
			}
			System.out.println();
		}
	
		sc.close();
		
	
	
	
	}

	
	
}
