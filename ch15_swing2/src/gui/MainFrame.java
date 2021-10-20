package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;


public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title); //����Ŭ���� JFrame Ÿ��Ʋ�� �����ϵ���
		
		Mainpanel mainpanel = new Mainpanel();
		
		
		setLayout(new BorderLayout());//����������â�� ������Ʈ�� ���̱� ����
		
		add(new Toolbar(), BorderLayout.NORTH);
				
		add(mainpanel, BorderLayout.CENTER);
		
		
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ ���α׷� ����
		setVisible(true);
	}
	

}
