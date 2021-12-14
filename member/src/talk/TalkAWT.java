package talk;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class TalkAWT extends MFrame implements ActionListener {

	TextField idTf, pwTf;
	Label logo, idl, pwl, msgl;
	Button logBtn;
	Socket sock;
	BufferedReader in;
	PrintWriter out;
	String id;
	String ip = "127.0.0.1";
	int port = 8003;
	String title = "Talk 1.0";
	String label[] = {"ID와 PASS를 입력하세요.",
								"ID와 PASS를 확인하세요.",
								"이중 접속입니다."};

	public TalkAWT() {
		super(450, 400, new Color(243, 97, 220));
		setLayout(null);
		setTitle(title);
		logo = new Label(title);
		logo.setFont(new Font("Dialog", Font.BOLD, 50));

		idl = new Label("ID");
		pwl = new Label("PASS");
		idTf = new TextField("aaa");
		pwTf = new TextField("1234");
		logBtn = new Button("로그인");
		msgl = new Label(label[0]);
		logo.setBounds(100, 50, 250, 100);
		idl.setBounds(150, 200, 50, 20);
		idTf.setBounds(200, 200, 100, 20);
		pwl.setBounds(150, 230, 50, 20);
		pwTf.setBounds(200, 230, 100, 20);
		logBtn.setBounds(150, 260, 150, 40);
		msgl.setBounds(150, 320, 150, 40);
		logBtn.addActionListener(this);
		add(logo);
		add(idl);
		add(idTf);
		add(pwl);
		add(pwTf);
		add(logBtn);
		add(msgl);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		try {
			if (obj == logBtn) {
				if (sock == null) {
					sock = new Socket(ip, port);
					in = new BufferedReader(new InputStreamReader(
							sock.getInputStream()));
					out = new PrintWriter(sock.getOutputStream(), true);
				}
				id = idTf.getText();
				out.println(ChatProtocol3.ID + ":" + id + ";"
						+ pwTf.getText());
				String line = in.readLine();
				int idx = line.indexOf(':');
				String cmd = line.substring(0, idx);
				String data = line.substring(idx + 1);
				if (cmd.equals(ChatProtocol3.ID)) {
					if (data.equals("F")) {
						msgl.setForeground(Color.red);
						msgl.setText(label[1]);
					} else if (data.equals("C")) {
						msgl.setForeground(Color.blue);
						msgl.setText(label[2]);
					} else if (data.equals("T")) {
						dispose();
						new TalkClient(in, out, id);
					}
				} 
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TalkAWT();
	}
}
