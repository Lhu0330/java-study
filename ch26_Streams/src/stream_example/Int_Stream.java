package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {


		//@formatte:off
		IntStream
			.range(1, 10) 	//1~10까지 정수
			.skip(5)		// 5개 아이템스킵
			.forEach(x -> System.out.println(x));
		//@formatte:on
		
		System.out.println();
		
		int val = IntStream.range(1, 5).sum();
		System.out.println(val);
	}

}
