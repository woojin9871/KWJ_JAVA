package JavaMisson._16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		LinkedList<Student> list = new LinkedList<>();
		list = getTxtToList(list);
		printList(list);
	}



	// 텍스츠 파일입력
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		
		// Scanner sc = new Scanner(System.in); // 키보드 입력
		try {
			File file = new File("student.txt");
			Scanner sc = new Scanner(file); // 파일 입력
			Student std;
			
			while(sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] date = stn.split("/");
				// [10][김휴먼][90][백엔드]
				
				int no = Integer.parseInt(date[0]);
				String name = date[1];
				int score = Integer.parseInt(date[2]);
				String className = date[3];
				
				std = new Student(no, name, score, className);
				
				list.offer(std); // Student 객체를 list 추가
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
		// 리스트 출력
		public static void printList(LinkedList<Student> list) {
			
			System.out.println("번호\t이름\t성적\t반");
			while( !list.isEmpty() ) {
				Student std = list.poll();
				int no = std.getNo();
				String name = std.getName();
				int score = std.getScore();
				String className = std.getClassName();
				
				System.out.println(no + "\t" + name + "\t" + score + "\t" + className);
			
		}
	
	}
}
