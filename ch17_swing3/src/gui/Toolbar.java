package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ColorListener implements ActionListener {
	private ColorChangeListener colorChanger;
	private Color color;
	
	public ColorListener(ColorChangeListener colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		colorChanger.changColor(color);
	}	
}


public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar(ColorChangeListener colorChanger) {
		JButton redButton = new JButton("RED");
		JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new ActionListener() { //익명ㅋ ㅡㄹ래스

			public void actionPerformed(ActionEvent e) {
				colorChanger.changColor(Color.RED); //마우스 클릭시 실행
				
			}
			
		});
		//람다식
		blueButton.addActionListener(e->colorChanger.changColor(Color.BLUE));
		
		add(redButton);
		add(blueButton);
	}

}
