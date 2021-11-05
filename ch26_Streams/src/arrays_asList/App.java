package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		//배열을 리스트로
		
		List<String> names = Arrays.asList("Eric", "Elena", "java");
		
		names.stream()
			.filter(name -> name.contains("a"))
			.map(String::toUpperCase)
			.forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(9,4,6,3,2,1);
		
		numbers.stream()
		.filter(n -> n > 3 )
		.sorted()
		.map(n -> n*10)
		.forEach(System.out::println);
		
	}

}
