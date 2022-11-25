package Day06.Ex01_Student;

public class Student {

	// 힉생의 속성 : 이름,나이,학번,전공
	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 생성자
	public Student() {
		
	}
	
	// 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	// 학생의 행동
	// 메소드
	// void : 반환타입을 지정하지 않을 때 사용하는 키워드
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		
		// 반환타입이 void 면, return 을 작성하지 않는다.
	}
	

	public double  getScore(int score1, int score2) {
		double averge = 0.0;
		// (평균) = (합계) / (개수)
		// (큰 타입) + (작은타입) => (큰 타입)
		// (double) / (int) => (double)
		averge = (double)(score1 + score2 ) / 2; // ?????
		return averge;
	}
	// 점수의 평균을 반환하는 메소드
	public double  getScore(int score1, int score2, int score3) {
		double averge = 0.0;
		// (평균) = (합계) / (개수)
		// (큰 타입) + (작은타입) => (큰 타입)
		// (double) / (int) => (double)
		averge = (double)(score1 + score2 + score3) / 3; // ?????
		return averge;
		}
	// 메소드 오버로딩
	public double  getScore(int [] scores) {
		double averge = 0.0;
		int sum = 0;
		for (int score : scores) {
			// (최종합계) = (이전합계) + (과목점수);
			sum += score;
			// sum = sum + score;
		}
		averge = (double)sum / scores.length;
		return averge;
	}


}
