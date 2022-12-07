package codeup;

import java.util.Scanner;

public class _1402 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		// 시작 : 0
		// 종료 : N-1
		//증가
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// 시작 : N-1
		// 종료 : 0
		// 감소
		for (int i = N-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
