package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() {
		System.out.println("hellow");
	}
	
	public static void main(String[] args) {
		// 메소드래퍼런스로 람다식 대체
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		service.scheduleAtFixedRate( App::greet , 0, 1000, TimeUnit.MICROSECONDS);
									//클래스이름::메소드이름(매개변수x)

	}

}
