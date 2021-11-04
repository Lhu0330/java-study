package string_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		Stream.of("헬로우","물병", "아프리카")
			.sorted() 		//정렬:알파벳숫
			.findFirst()	//첫번째
			.ifPresent((x) -> System.out.println(x));
		
		System.out.println();
		
		String[] items = { "치킨", "원숭이", "고릴라", "치약", "고라니", "치과", "고양이"};
		Stream.of(items)
			.filter((x) -> x.startsWith("치"))
			.sorted()
			.forEach(x -> System.out.print(x +","));
		
		System.out.println();
		System.out.println();
		
		Arrays.stream(new int[] {2,4,6,8,10})
		.filter(x -> x<5)
		.map( x -> x*x)
		.average()
		.ifPresent(n -> System.out.println(n));
		
		System.out.println();
		
		//배열으 리스트로
		List<String> listItems = Arrays.asList(items);
		listItems.stream()
			.filter( x -> x.startsWith("고"))
			.sorted()
			.forEach(x-> System.out.print(x + ","));
		//배열은 stream.of(배열) 스트림 생성, 리스트는 stream()생성
		//filter(x->조건) 조건이 참이면 남기고 아니면 제외
		//sorted()정렬
		//map(x->리턴값) 아이템 값을 리턴값으로 변경
	}

}
