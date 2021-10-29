package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GamePanel gamepanel = new GamePanel();
	
	public MainFrame() {
		super("Game OF Life"); //타이틀 명
		
		setLayout(new BorderLayout()); // 레이아웃 구역설정
		add(gamepanel, BorderLayout.CENTER); //게임패널이 가운데
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
//				System.out.println("키눌렀음!");
//				System.out.println(e);
				int code = e.getKeyCode();
//				System.out.println(code);
				switch(code) {
				case 32:
//					System.out.println("스페이스바");
					gamepanel.next();
					break;
				case 8:
//					System.out.println("백 스페이스");
					gamepanel.clear();
					break;
				case 10:
//					System.out.println("엔터");
					gamepanel.randomize();
					break;
				}
			}
		});
		
		
		
		setSize(1300, 1000); //창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫을때 프로그램 종료			
		setVisible(true); //보이게 하기	
	}

}
