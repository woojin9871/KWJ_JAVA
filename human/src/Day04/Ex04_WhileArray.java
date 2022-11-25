package Day04;

import java.util.Scanner;

public class Ex04_WhileArray {

	public static void main(String[] args) {
		// 정수 5개를 입력받아 배열에 저장하고,
		// Y를 입력하면, 한 번 더 입력
		// N으 입력하면, 종료하는 프로그램을 만드시오.
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		String finish = "";
		do {
			System.out.println("정수 5개 입력");

			// 살제 입력
			// 1^2^3^4^5<-
			// ^ : 뛰어쓰기
			// <- : 엔터
			// 5까지 sc.nextInt() 로 입력받아서 배열에 저장되고,
			// <-(엔터)가 입력버퍼에 남아있다.
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			// 남은 <-(엔터)를 버퍼에서 빼준다.
			sc.nextLine();

			// 새로 문자열을 입력받는다.
			System.out.println("다시 입력?(Y/N) : ");
			finish = sc.nextLine();
			System.out.println(finish);

			// 그런데, 문자열이 비교되지 않는다.
			// 문자열 자체의 비교는 equals() 메소드로 한다
			// "Y".equals(finish);
		} while (finish.equals("Y"));
			  /* 1. 변수 N 선언
				 2차원배얄 arr 선언
				 2. 정수 N 입력
				 3. 2차원 배열 지그재그로 채우기
					   홀수행: -> 증가
					   짝수행: <- 증가
					   (번갈아 가면서 방향전환)
					i:행
					j:열
					i: 1, j=0 ---> N-1 ,j++
					i: 2, j=N-1 -->    ,j--
					
				 4. 한 사이클마다 증감방향 전환
				 
				 5. 출력
				*/
	    		sc.close();		
	}

}
