package ch14;

import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlFrameEx1 extends MFrame implements ActionListener {
	
	TextArea ta;
	TextField tf;
	Button connect;
	Button save;
	
	public UrlFrameEx1() {
		super(500,500);
		setTitle("ViewHost");
		Panel p = new Panel();
		p.add(tf = new TextField("http://", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		ta = new TextArea();
		add("North", p);
		add("Center", ta);
		save.setEnabled(false);
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
	}
	
	@Override //annotation:�ּ��� �޴�
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String host = tf.getText();
		if(obj==tf||obj==connect) {
			ta.setText("");
			save.setEnabled(true);
			connectHost(host);
		}else if (obj==save) {
			createFile(tf.getText(), ta.getText());
			save.setEnabled(false);
			tf.setText("http://");
			ta.setText("");
			ta.append("�����Ͽ����ϴ�.");
			tf.requestFocus();
		}

	}

	public void createFile(String file, String content) {
		try {
			FileWriter fw = new FileWriter("ch14/"+file);
			fw.write(content);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();

		}	
	}
	
	//�������� ����� �ִ��� ����ȭ ���Ѿ� �Ѵ�.
	public void connectHost(String host) {
		try {
			URL url = new URL("http://jspstudy.co.kr");
			BufferedReader br =
					new BufferedReader(new InputStreamReader(
							url.openStream(),"UTF-8"));
			String line = "";
			while(true) {
				line = br.readLine();
				if(line==null) 
					break;
				ta.append(line);
			}
			br.close();
		} catch (Exception e) {
			ta.append("�ش�Ǵ� ȣ��Ʈ�� �����ϴ�.");
			//e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UrlFrameEx1();
		
	}

}
