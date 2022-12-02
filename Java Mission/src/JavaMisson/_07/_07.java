package JavaMisson._07;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr [] = new int [5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// 교환
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp; 
				}
			}
		}	

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
