package list_interface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 어레이리스트와 링크드리스트 둘다 리스트 인터페이스를 구현함
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		displayList(list1);

		List<Integer> list2 = new ArrayList<>();
		
		list2.addAll(list1); //리스트 1의 내용을 리스트2에 모두 입력
		list2.add(5);
		list2.add(6);
		
		
		displayList(list2);
		
	}
	
	private static void displayList(List<Integer> list) {
		list.forEach(System.out::println);
	}
}
