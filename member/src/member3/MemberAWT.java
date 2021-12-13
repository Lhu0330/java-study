package member3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberAWT extends MFrame implements ActionListener {
	
	JButton b1, b2, b3, b4;
	List list;

	JLabel label;
	JTextField tf1, tf2, tf3, tf4;
	JPanel p1, p2, p3;
	JButton insBtn, upBtn, zipBtn;
	Vector<MemberBean> vlist;
	MemberMgr mgr;
	int id;
	ZipcodeFrame zf;

	public MemberAWT() {
		super(300, 450);
		setTitle("Member MAG Ver2.0");
		mgr = new MemberMgr();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		label = new JLabel("");
		viewList();
		add(label, BorderLayout.NORTH);
		b1 = new JButton("����");
		b2 = new JButton("����");
		b3 = new JButton("�Է�");
		b4 = new JButton("����Ʈ");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		p1 = new JPanel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		add(p1, BorderLayout.SOUTH);
		validate();
	}

	private void viewList() {
		label.setOpaque(true);
		label.setText("NO  NAME          PHONE                TEAM");
		label.setBackground(Color.CYAN);
		vlist = mgr.selectAll();
		list = new List(vlist.size(), false);
		for (int i = 0; i < vlist.size(); i++) {
			MemberBean bean = vlist.get(i);
			String str = (i + 1)/* bean.getId() */+ "    "
					+ bean.getName().trim() + "       "
					+ bean.getPhone().trim() + "       " + bean.getTeam();
			list.add(str);
		}// for
		add(list, BorderLayout.CENTER);
		int len = list.getItemCount();
		if (len > 0)
			list.select(0);
	}

	public void insertForm() {
		label.setText("ȸ���Է���");
		label.setBackground(Color.GRAY);
		p3.setLayout(new GridLayout(6, 1));

		JPanel p5 = new JPanel();
		p5.add(new JLabel("NAME  :"));
		tf1 = new JTextField(20);
		p5.add(tf1);
		p3.add(p5);

		JPanel p6 = new JPanel();
		p6.add(new JLabel("PHONE  :"));
		tf2 = new JTextField(20);
		p6.add(tf2);
		p3.add(p6);

		JPanel p7 = new JPanel();
		p7.add(new JLabel("TEAM  :"));
		tf3 = new JTextField(20);
		p7.add(tf3);
		p3.add(p7);
		
		JPanel p8 = new JPanel();
		zipBtn = new JButton("�����ȣ");
		p8.add(zipBtn);
		p3.add(p8);
		
		JPanel p9 = new JPanel();
		p9.add(new JLabel("�ּ�  :"));
		tf4 = new JTextField(20);
		zipBtn.addActionListener(this);
		p9.add(tf4);
		p3.add(p9);

        JPanel p10 = new JPanel();
		insBtn = new JButton("����");
		insBtn.addActionListener(this);
		p10.add(insBtn);
		p3.add(p10);

		add(p3, BorderLayout.CENTER);
	}

	public void updateForm(MemberBean bean) {
		label.setText("ȸ��������");
		label.setBackground(Color.YELLOW);
		p3.setLayout(new GridLayout(6, 1));
		id = bean.getId();
		JPanel p4 = new JPanel();
		p4.add(new JLabel("NAME  :"));
		tf1 = new JTextField(bean.getName(), 20);
		p4.add(tf1);
		p3.add(p4);

		JPanel p5 = new JPanel();
		p5.add(new JLabel("PHONE  :"));
		tf2 = new JTextField(bean.getPhone(), 20);
		p5.add(tf2);
		p3.add(p5);

		JPanel p6 = new JPanel();
		p6.add(new JLabel("TEAM  :"));
		tf3 = new JTextField(bean.getTeam(), 20);
		p6.add(tf3);
		p3.add(p6);

		JPanel p7 = new JPanel();
		zipBtn = new JButton("�����ȣ");
		p7.add(zipBtn);
		p3.add(p7);
		
		JPanel p8 = new JPanel();
		p8.add(new JLabel("�ּ�  :"));
		tf4 = new JTextField(bean.getAddress(), 20);
		zipBtn.addActionListener(this);
		p8.add(tf4);
		p3.add(p8);

		JPanel p9 = new JPanel();
		upBtn = new JButton("��������");
		upBtn.addActionListener(this);
		p9.add(upBtn);
		p3.add(p9);

		add(p3, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == b1/* ������ư */) {
			int i = list.getSelectedIndex();
			MemberBean bean = vlist.get(i);
			list.removeAll();
			remove(list);
			updateForm(bean);
		} else if (obj == b2/* ������ư */) {
			int i = list.getSelectedIndex();
			MemberBean bean = vlist.get(i);
			if (mgr.delete(bean.getId())) {
				p3.removeAll();
				remove(p3);
				list.removeAll();
				remove(list);
				vlist.removeAllElements();
				viewList();
			}
		} else if (obj == b3/* �Է¹�ư */) {
			p3.removeAll();
			list.removeAll();
			remove(list);
			insertForm();
		} else if (obj == b4/* ����Ʈ */) {
			p3.removeAll();
			remove(p3);
			list.removeAll();
			remove(list);
			vlist.removeAllElements();
			viewList();
		} else if (obj == insBtn/* �Է����� */) {
			MemberBean bean = new MemberBean();
			bean.setName(tf1.getText());
			bean.setPhone(tf2.getText());
			bean.setTeam(tf3.getText());
			bean.setAddress(tf4.getText());
			if (mgr.insert(bean)) {
				p3.removeAll();
				remove(p3);
				vlist.removeAllElements();
				viewList();
			}
		} else if (obj == upBtn/* �������� */) {
			MemberBean bean = new MemberBean();
			bean.setId(id);
			bean.setName(tf1.getText());
			bean.setPhone(tf2.getText());
			bean.setTeam(tf3.getText());
			bean.setAddress(tf4.getText());
			if (mgr.update(bean)) {
				p3.removeAll();
				remove(p3);
				vlist.removeAllElements();
				viewList();
			}
		}else if(obj==zipBtn/*�캯��ȣ*/){
			if(zf==null)
				zf = new ZipcodeFrame(this);
			else
				zf.setVisible(true);
		}
		validate();
	}

	public static void main(String[] args) {
		new MemberAWT();
	}
}
