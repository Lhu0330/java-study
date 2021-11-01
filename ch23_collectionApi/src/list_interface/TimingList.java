package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimingList {
	public static void main(String[] args) {
		//어레이와 링크드 리스트의 시간 비교
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		//클래스 가져올때 단축키 ctrl + space 여러개 가져올때 ctrl + shift+ o
		
//		long duration = timeOperations(arrayList);
		long duration = timeOperations(linkedList);
		
		System.out.println("즉정시간 : " + duration);
		//그냥 순서대로 추가할때 에러이리스트가 링크드보다 5배이상 빠르다\
		//특정위치에 추가또는 제거할때 링크드 리스트가 10배는 빠르다
	}
	
	public static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<1000000; i++) {
			list.add(0, i); //백만번 입력
		}
		
		return System.currentTimeMillis() - start;
	}
}
