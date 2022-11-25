package Day05;

import java.util.Scanner;

//양의 정수 M과  N을 입력받아 저장
//M행 N열에 2차원 배열을 생성
//각 요소의 값 입력받고 그대로 출력하시오
//입력예시
//M:2
//N:3
//123
//456
//출력예시
//123
//456
//같은 과정을 한번더 x행 y열로 입력받고 출력하시오
//단 x행 y열의 2차원 배열은 foreach 문 이용하여 출력하시오

public class Ex04_Matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();

		// M행 N열의 2차원 배열 선언 및 생성
		int arr[][] = new int[M][N];

		// 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}

		System.out.print("X : ");
		X = sc.nextInt();
		System.out.print("Y : ");
		Y = sc.nextInt();

		int arr2[][] = new int[X][Y];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for (int[] row : arr2) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
			sc.close();
		}
	}
}