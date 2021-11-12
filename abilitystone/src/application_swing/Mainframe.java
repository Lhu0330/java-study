package application_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;




public class Mainframe extends JFrame  {
	private static final long serialVersionUID = 1L;
	
	public int countcheck(JLabel[] c) {
		int b = 0;
		try {
			for(int i =0; i<c.length; i++) {
				
				if(c[i].getText().equals(" o ")) {
					b++;
				}else {
					
				}
				
			}
		} catch (NullPointerException e) {
			
		}
		
		return b;
			
	}
	
	public Mainframe(String title) {
		
		
		GridBagConstraints[] gbc = new GridBagConstraints[11];
		GridBagConstraints gbc1 = new GridBagConstraints();
		Font font = new Font("Serif", Font.BOLD, 30);
	
		Font font1 = new Font("Serif", Font.BOLD, 25);
		Probability o = new Probability();
		
				
		JFrame f = new JFrame(title);
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);
		f.setLocationRelativeTo(null);
		
		JPanel c = new JPanel();
		c.setLayout(new GridBagLayout());
		c.setBounds(200,200,800,200);
	
		
		JButton j = new JButton("다시하기");
		JButton j1 = new JButton("도움말");
		JButton j2 = new JButton("끝내기");
		JButton j3 = new JButton("세공");
		JButton j4 = new JButton("세공");
		JButton j5 = new JButton("세공");
		
		
		JLabel a1 = new JLabel("증가능력: ");
		a1.setForeground(Color.BLUE);
		a1.setHorizontalAlignment(JLabel.CENTER);
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		
		c.add(a1,gbc1);
		
		
		JLabel b1[] = new JLabel[11];  
		
		for (int i = 0 ; i<10; i++) {
			b1[i] = new JLabel(" ? ");
			b1[i].setHorizontalAlignment(JLabel.CENTER);
			gbc[i] = new GridBagConstraints();
			gbc[i].gridx = i+1;
			gbc[i].gridy = 0;
			b1[i].setFont(font);
			b1[i].setForeground(Color.BLUE);
			c.add(b1[i],gbc[i]);
		}
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 11;
		gbc1.gridy = 0;
		c.add(j3,gbc1);
		
		JLabel s1 = new JLabel("성공 : " + Integer.toString(countcheck(b1)));
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 12;
		gbc1.gridy = 0;
		s1.setForeground(Color.BLUE);
		c.add(s1,gbc1);
		
		JLabel a2 = new JLabel("증가능력: ");
		a2.setHorizontalAlignment(JLabel.CENTER);
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 1;
		a2.setForeground(Color.BLUE);
		c.add(a2,gbc1);
		
		
		JLabel b2[] = new JLabel[11];  
		
		for (int i = 0 ; i<10; i++) {
			b2[i] = new JLabel(" ? ");
			b2[i].setHorizontalAlignment(JLabel.CENTER);
			gbc[i] = new GridBagConstraints();
			gbc[i].gridx = i+1;
			gbc[i].gridy = 1;
			b2[i].setFont(font);
			b2[i].setForeground(Color.BLUE);
			c.add(b2[i],gbc[i]);
		}
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 11;
		gbc1.gridy = 1;
		c.add(j4,gbc1);
		
		JLabel s2 = new JLabel("성공 : " + Integer.toString(countcheck(b2)));
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 12;
		gbc1.gridy = 1;
		s2.setForeground(Color.BLUE);
		c.add(s2,gbc1);
		
		
		JLabel a3 = new JLabel("감소능력: ");
		a3.setHorizontalAlignment(JLabel.CENTER);
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 2;
		a3.setForeground(Color.RED);
		c.add(a3,gbc1);
		
		
		JLabel b3[] = new JLabel[11];  
		
		for (int i = 0 ; i<10; i++) {
			b3[i] = new JLabel(" ? ");
			b3[i].setHorizontalAlignment(JLabel.CENTER);
			gbc[i] = new GridBagConstraints();
			gbc[i].gridx = i+1;
			gbc[i].gridy = 2;
			b3[i].setFont(font);
			b3[i].setForeground(Color.RED);
			c.add(b3[i],gbc[i]);
		}
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 11;
		gbc1.gridy = 2;
		c.add(j5,gbc1);
		
		JLabel s3 = new JLabel("성공 : " + Integer.toString(countcheck(b3)));
		gbc1 = new GridBagConstraints();
		gbc1.gridx = 12;
		gbc1.gridy = 2;
		s3.setForeground(Color.RED);
		c.add(s3,gbc1);
		
//		gbc1 = new GridBagConstraints();
//		gbc1.gridx = 5;
//		gbc1.gridy = 3;
//		c.add(j,gbc1);
//		gbc1 = new GridBagConstraints();
//		gbc1.gridx = 6;
//		gbc1.gridy = 3;
//		c.add(j2, gbc1);
		
		j.setFont(font);
		j2.setFont(font);
		j3.setFont(font);
		j4.setFont(font);
		j5.setFont(font);
		a1.setFont(font);
		a2.setFont(font);
		a3.setFont(font);
		s1.setFont(font);
		s2.setFont(font);
		s3.setFont(font);
		j1.setFont(font);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(j);
		p.add(j2);
		p.add(j1);
		p.setBounds(380,500,400, 300);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setBounds(550,400,400,100);
		JLabel i1 = new JLabel("현재 확률은 : " + String.format("%.0f", o.n*100)+"%입니다");
		i1.setFont(font1);
		p1.add(i1);
		
		f.getContentPane().add(c);
		f.getContentPane().add(p);
		f.getContentPane().add(p1);
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을때 프로그램 종료
		
		j3.addActionListener(event -> {
			int h1 = 0;
//			System.out.println("click");
			for( int i=0; i<10; i++) {
//				System.out.println(b1[i].getText());
				if (b1[i].getText().equals(" ? ")) {
					b1[i].setText(o.q1());
					i1.setText("현재 확률은 : " + String.format("%.0f", o.n*100)+"%입니다");
					s1.setText("성공 : " + Integer.toString(countcheck(b1)));
					if(i==9) j3.setEnabled(false);
					break;
				} 
			}
		
			
		});
		j4.addActionListener(event -> {
//			System.out.println("click");
			for( int i=0; i<10; i++) {
//				System.out.println(b1[i].getText());
				if (b2[i].getText().equals(" ? ")) {
					b2[i].setText(o.q2());
					i1.setText("현재 확률은 : " + String.format("%.0f", o.n*100)+"%입니다");
					s2.setText("성공 : " + Integer.toString(countcheck(b2)));
					if(i==9) j4.setEnabled(false);
					break;
				} 
			}
			
			
		});
		j5.addActionListener(event -> {
//			System.out.println("click");
			for( int i=0; i<10; i++) {
//				System.out.println(b1[i].getText());
				if (b3[i].getText().equals(" ? ")) {
					b3[i].setText(o.q3());
					i1.setText("현재 확률은 : " + String.format("%.0f", o.n*100)+"%입니다");
					s3.setText("성공 : " + Integer.toString(countcheck(b3)));
					if(i==9) j5.setEnabled(false);
					break;
				} 
			}
			
		});
		
		j.addActionListener(event -> {
			for(int i=0; i<10; i++) {
				b1[i].setText(" ? ");
				b2[i].setText(" ? ");
				b3[i].setText(" ? ");
				o.clear();
				i1.setText("현재 확률은 : " + String.format("%.0f", o.n*100)+"%입니다");
				s1.setText("성공 : " + Integer.toString(countcheck(b1)));
				s2.setText("성공 : " + Integer.toString(countcheck(b2)));
				s3.setText("성공 : " + Integer.toString(countcheck(b3)));
				j3.setEnabled(true);
				j4.setEnabled(true);
				j5.setEnabled(true);
			}
		});
		
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		
		});
		
		j1.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "어빌리티스톤은 2개 증가능력과 1개의 감소능력으로 이루어져있습니다. \n 증가능력은 최대한 많이 감소 능력은 최대한 적게 띄운는 것이 목표입니다. \n 확률은 75퍼센트에서 시작하며 성공할때마다 10퍼센트씩 감소하고 실패할때마다 10퍼센트씩 상승합니다. \n 행운을 빕니다.");
		});
		
	}
	

}
