package gui;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.*;


class ColorListener implements ActionListener {
	private Mainpanel mainpanel;
	private Color color;
	
	public ColorListener(Mainpanel mainpanel, Color color) {
		this.mainpanel = mainpanel;
		this.color = color;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mainpanel.setBackground(color);
		
	}
	
}

class blueListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("파란버튼 클릭!");
		
	}
	
}

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	public Toolbar() {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		
		redButton.addActionListener(new ColorListener(mainpanel, Color.RED) );
		blueButton.addActionListener(new ColorListener(mainpanel, Color.RED) );
		
		add(redButton);
		add(blueButton);
		
	}

}
