package timer_ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Task extends TimerTask {

	@Override
	public void run() {
		System.out.println("헬로우!");

	}

}

class a extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");		
	}
	
}

public class App {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(new Task(), 0, 5, TimeUnit.SECONDS);

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new a(), 30000L, 10000L);
	}

}
