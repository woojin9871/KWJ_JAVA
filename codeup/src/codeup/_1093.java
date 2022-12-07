package codeup;

import java.util.Scanner;

public class _1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[23+1];
		
		for (int i = 1; i < N; i++) {
			int index = sc.nextInt();
			
			arr[index]++;
			
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.println();
		}
		sc.close();
	}
}
