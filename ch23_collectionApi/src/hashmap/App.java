package hashmap;

import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		//해시맵은 순서(인덱스)가 없고 키 값으로 인덱스 대체
		HashMap<Integer, String> people = new HashMap<>();
		//맵은 입력시 값이 2개(key, value)이기 때문에 add가 아니라 put으로 입력
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); //4번에 key에 value 값을 마이클로 변경
		people.put(10, "수지");
		
		people.forEach((k,v) -> {
			System.out.println(k + ": "+ v);
		});
		
		//키값에 해당하는 값 가져오기
		System.out.println(people.get(4));
		
		String person = people.get(10);
		System.out.println(person);
		
		System.out.println();

	}

}
