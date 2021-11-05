package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// 특정타입(제네릭)을 검사(test)해서 참/거짓 판별해 리턴
		List<Integer> number = new ArrayList<>();
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(2);
		number.add(9);
		number.add(10);
		number.add(4);
		
		number.removeIf(n -> n<6);
		
		number.forEach(t -> System.out.println(t));
	}

}
