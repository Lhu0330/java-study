package application;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// 프로그램시작
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MainFrame();
			}
		});
	}

}
