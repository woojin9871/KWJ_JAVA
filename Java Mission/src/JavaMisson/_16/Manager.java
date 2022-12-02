package JavaMisson._16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

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
}
