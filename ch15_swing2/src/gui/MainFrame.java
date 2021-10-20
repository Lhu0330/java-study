package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); //상위클래스 JFrame 타이틀을 생성하도록
		
		Mainpanel mainpanel = new Mainpanel();
		
		
		setLayout(new BorderLayout());//메인프레임창에 컴포너트를 붙이기 위함
		
		add(new Toolbar(), BorderLayout.NORTH);
				
		add(mainpanel, BorderLayout.CENTER);
		
		
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을때 프로그램 종료
		setVisible(true);
	}
	

}
