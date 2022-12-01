package JavaMisson;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i += 2) {
			sum += i;
			System.out.print(i);
			
			if (i != num-1) {
				System.out.print("+");
			}
		}
		System.out.print("=" + sum);
		
		System.out.println();

		for (int i = 2; i <= num; i += 2) {
			sum += i;
			System.out.print(i);
	
			if (i != num) {
				System.out.print("+");
			}
		}
		System.out.print("=" + sum);
		
		System.out.println();
		
		for (int j = 1; j <= num; j++) {
			if (num % j == 0)
				System.out.print(j + " ");
		}
		sc.close();
	}
}
