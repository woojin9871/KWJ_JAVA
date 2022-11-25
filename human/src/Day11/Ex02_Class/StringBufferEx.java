package Day11.Ex02_Class;

public class StringBufferEx {

	public static void main(String[] args) {
		//StringBuffer
		// : 문자열을 조작하는 클래스
		// - 문자열을 추가/수정/삭제 할 수 있다
		StringBuffer sd = new StringBuffer("This");
		
		System.out.println(sd);
		
		// append("추가할 문자열") :ㅣ 문자열 맨뒤에 문자열 추가
		sd.append(" is Java");
		System.out.println(sd);
		
		// insert(index, "추가 문자열") : 지정한 index 위치에 문자열 추가
		sd.insert(7, " real");
		System.out.println(sd);
		
		// insert(시작index, 끝index+1, "대체 문자열")
		// : 시작index~끝index 까지 문자열을 새 문자열로 대체
		sd.replace(8, 12, " good");
		System.out.println(sd);
		
		// delete(시작index, 끝index+1)
		// : 시작index~끝index 까지 문자열을 삭제
		sd.delete(8, 13);
		System.out.println(sd);
		
		// setLength(길이) : 문자열의 길이를 지정
		sd.setLength(4);
		System.out.println(sd);
	}
}
