
package gui;

import java.awt.Color;
import javax.swing.JPanel;

public class Mainpanel extends JPanel implements ColorChangeListener{
	private static final long serialVersionUID = 1L;
	
	public Mainpanel() {
		setBackground(Color.GREEN);
	}

	@Override
	public void changColor(Color color) {
		setBackground(color);
		
	}

}