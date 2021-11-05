package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		//리스트의 foreach메소드는 매개변수는 consumber인터페이스 객체이다.
		//인터페이스로는 객체를 만들수  없기 때문에 익명클래스를 만들고 그안에 추상메소드를 완성하면된다.
		list.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.print(t);
				System.out.print(" ");
			}
			
		});
		
		//람다식으로 간단한게 
		System.out.println();
		
		list.forEach(t-> {
			System.out.print(t);
			System.out.print(" ");
		});
		
	}
}
