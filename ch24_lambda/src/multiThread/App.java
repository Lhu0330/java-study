package multiThread;

public class App {
	
	public void run() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		//멀티 쓰레드
		Runnable runnable = () -> {
			for(int i = 0; i< 100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		//runnable.run();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		//t1.start() 메소드는 t1의 runnable 람다식 실행
		t1.start(); //쓰레드 시작
		t2.start();
		
		t1.join();
		t2.join();

		
		System.out.println("헬로우!");
	}

}
