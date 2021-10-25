package static_innerclass;

public class Person {
	class Head { // 내부 클래스 head
		public void print() {
			System.out.println("헤드");
		}
	}

	static class Body { // 스테틱 내부 클래스 body
		public void print() {
			System.out.println("바디");
		}
	}

	public void print() { // 클래스 person의 메소드
		Head head = new Head(); //헤드 객체
		Body body = new Body(); //바디 객체

		head.print();
		body.print();
	}
}
