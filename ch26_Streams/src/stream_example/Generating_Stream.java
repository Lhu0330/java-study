package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {

		Stream.of(1,2,3).forEach(System.out::println);
		Stream.of("하나","둘","셋").forEach((t) -> System.out.println(t));
		
		System.out.println();
		
		Stream.generate(()->"헬로우").limit(5).forEach(System.out::println);

	}

}
