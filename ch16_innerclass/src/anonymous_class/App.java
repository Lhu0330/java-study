package anonymous_class;

public class App {

	private String name = "���";

	public static void main(String[] args) {
		new App().start();

	}

	private void start() {
//		System.out.println(name);
//		Runnable runner = new Runnable() { // �͸�Ŭ����
//
//			public void run() {
//				System.out.println(name); // ����Ŭ������ �ܺ�Ŭ������ ���� ���
//
//			}
//
//		};

		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}

	public void activate(Runnable runnable) {
		runnable.run();
	}
}
