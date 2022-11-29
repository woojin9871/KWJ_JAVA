package Day13.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 List 인터페이스
 - 객체 추가 
 add(E) : 맨 끝에 추가
 add(index, E) : index 에 추가
 set(imdex, E) : index 의 객체를 E 로 변경
 
 - 객체 검색
 contains(Object) : 객체가 포함되어있는지 확인 (true, false)
 get(index) : index 에 있는 객체를 반환
 inEmpty() : 컬렉교션이 비어있는지 확인
 size() : 저장된 객체의 수를 반환
 
 - 갹채 삭제
 clear() : 모든 객체를 삭제
 remove(index) : index 에 있는 객체를 삭제
 remove(Object) : 객체를 삭제
 */

public class VectorEx {

	public static void main(String[] args) {
		// 백터 객체 생성
		Vector<String> vector = new Vector<String>(10);
		// 추가
		vector.add("아메리카노");
		vector.add("블루베리스무디");
		vector.add("헤이즐넛라떼");
		vector.add("아이스티");

		// 개수, 용량 확인
		System.out.println("개수 : " + vector.size());
		System.out.println("용량 : " + vector.capacity());
		System.out.println();

		// 검색
		// 반복 방법 1
		System.out.println(">>반복 1");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();

		// 반복 방법 2
		System.out.println(">>반복 2");
		for (String item : vector) {
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();

		// 삭제
		// 삭제 할 떄, index 는 앞으로 한 칸씩 당여짐
		vector.remove(0);
		vector.remove(1);
		vector.remove("블루베리스무디");
		vector.remove("아이스티");

		if (!vector.isEmpty()) {
			for (String item : vector) {
				System.out.println("메뉴 이름 : " + item);
			}
		} else {
			System.out.println("메뉴가 없습니다");
		}

		Scanner sc = new Scanner(System.in);

		// Vector 는 List 인터페이스를 구현클래스
		List<String> newMenuList = new Vector<String>();
		System.out.println("메뉴 추가하기 (종료:0)");
		do {
			System.out.print("추가 할 메뉴 이름 : ");
			String menu = sc.nextLine();

			if (menu.equals("0"))
				break;

			newMenuList.add(menu);
		} while (true);

		// 반복 방법 3
		// Iterator 를 이용한 반복
		// 해당 리스트 컬렉션으로부터 Interator 객체를 가져옴
		System.out.println(">>반복 3");
		// 1. 컬렉션겍체.iterator() 메소드로, Iterator 객체를 가져옴
		Iterator<String> it = newMenuList.iterator();

		System.out.print("새로 추가된 메뉴");
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
			if (it.hasNext()) {
				System.out.println(", ");
			} else {
				System.out.println();
			}
		}

		// 컬렉션 전체 추가
		vector.addAll(newMenuList);
		System.out.print("모든 메뉴 : ");
		System.out.println(vector);

		// 객체 변경
		System.out.println();
		do {
			System.out.println("변경할 메뉴 (종료:0) : ");
			String update = sc.nextLine();

			if (update.equals("0"))
				break;

			if (!vector.contains(update)) {
				System.out.println("변경할 메뉴가 없습니다.");
				continue;
			}

			// 해당 객체의 index 반환
			System.out.println("새 메뉴 : ");
			String newMenu = sc.nextLine();

			// 객체 변경
			int index = vector.indexOf(update); 
			vector.set(index, newMenu);
			System.out.println("메뉴가 변경되었습니다.");
			System.out.println(update + "-->" + newMenu);
		} while (true);

		System.out.println("주문하실 메뉴 : ");
		String order = sc.nextLine();
		if (vector.contains(order)) {
			System.out.println(order + "가 주문되었습니다.");
		} else {
			System.out.println("존재하지 않는 메뉴 입니다.");
		}
	}
}
