package JavaMisson._04;

import java.util.Scanner;

// 자연수 N을 입력받아, 삼각형 모양의 "*" 출력하시오.
// 입력 : 5
// 출력 :
//     * 
//    ***
//   *****
//  *******
// *********

// 1줄 : 공백4, *1
// 2줄 : 공백3, *3
// 3줄 : 공백2, *5
// 4줄 : 공백1, *7
// 5줄 : 공백0, *9

public class _04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j < (N + 1) - i; j++) { // j가 공백
				// 공백
				// 1 2 3 4
				// 1 2 3
				// 1 2
				// 1
				// x
				System.out.print(" ");
			}
			for (int j = 1; j < 2 + (i - 1) * 2; j++) { // 공백 만들기와 정 반대 // 등차수열 공식 사용
				// 별													   // a+(n−1)d	
				// 1													   // a = 초수 
				// 1 2 3												   // d = 차이
				// 1 2 3 4 5
				// 1 2 3 4 5 6 7
				// 1 2 3 4 5 6 7 8 9

				System.out.print("*");
			}
			System.out.println();
			sc.close();

		}
	}
}
