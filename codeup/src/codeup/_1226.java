package codeup;

import java.util.Scanner;

public class _1226 {
		// 지정된 로또번호
		// 13 23 24 35 40 45 7
		// 2 6 7 23 40 44
	
		public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int l[] = new int[7];
		int c[] = new int[6];
		int count = 0;
		int rank = 0;
	
		// 입력
		for (int i = 0; i < l.length; i++) {
			l[i] = sc.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		
		// 비교
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if( c[i] == l[j] ) {
					count++;
					break;
			}
		}
	}
		// count = 2
		// 개수 확인
		switch (count) {
			case 6: rank = 1;
				break;
			case 5: rank = 3;
				// 보너스 번호 확인
			for (int i = 0; i < c.length; i++) {
				//  l[6] : 보너스 번호
				if (l[6] == c[i]) {
					rank = 2;
				}
				
			}   
				break;
			case 4: rank = 4;
				break;
			case 3: rank = 5;
				break;
			case 2: rank = 0;
				break;
		// rank = 0
		
		}
			System.out.println( + rank );
		sc.close();	
		}
    
}

