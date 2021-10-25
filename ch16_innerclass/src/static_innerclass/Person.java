package static_innerclass;

public class Person {
	class Head { // ���� Ŭ���� head
		public void print() {
			System.out.println("���");
		}
	}

	static class Body { // ����ƽ ���� Ŭ���� body
		public void print() {
			System.out.println("�ٵ�");
		}
	}

	public void print() { // Ŭ���� person�� �޼ҵ�
		Head head = new Head(); //��� ��ü
		Body body = new Body(); //�ٵ� ��ü

		head.print();
		body.print();
	}
}
