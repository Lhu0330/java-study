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
		System.out.println("Çï·Î¿ì!");

	}

}

class a extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "°è¶õ »î±â ¿Ï·á");		
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
