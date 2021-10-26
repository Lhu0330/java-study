package gui;

import java.awt.*;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	
	
	
	public MainFrame(String title) {
		super(title); //JFrame에 타이틀을 생성하도록
				
		Mainpanel mainPanel = new Mainpanel();
		
		setLayout(new BorderLayout()); //메인프레임창에 컴포넌트를 붙이기 위함
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER); //중앙 가운데 패널을 붙이기
				
		setSize(600, 400); //창 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫을때 프로그램 종료			
		setVisible(true); //보이게 하기	
	}

}
