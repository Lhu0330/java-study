package multiThread2;

public class App {
	
	private int value = 0;
	
	private synchronized void increment() { //synchronized로 한 쓰레드가 사용중에 다른 쓰레드 사용 못함
		value ++;
	}
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for(int i = 0; i< 10000; i++) {
				increment();
				}
			};
		
		//runnable.run();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		//t1.start() 메소드는 t1의 runnable 람다식 실행
		t1.start(); //쓰레드 시작
		t2.start();
		t3.start();
		
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("value: "+ value);
	}
	

	public static void main(String[] args) throws InterruptedException {
		//멀티 쓰레드
		new App().run();
	}

}
