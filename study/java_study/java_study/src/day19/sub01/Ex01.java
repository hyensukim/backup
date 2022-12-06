package day19.sub01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ex01 extends JFrame implements ActionListener{

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JTextField tf1;
	
	public Ex01() {
		super("����01");
		setVisible(true);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		btn1 = new JButton("��ư1");
		btn2 = new JButton("��ư2");
		btn3 = new JButton("��ư3");
		
		tf1 = new JTextField(30);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(tf1);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	public static void main(String[] args) {
		new Ex01();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
//		String btnNm = btn.getText();
		
		if(btn == btn1) {//��ư1 Ŭ��
			JOptionPane.showMessageDialog(this, "�޼���1");
		}else if(btn == btn2) {//��ư2 Ŭ��
			String text = tf1.getText();
			String inputText = JOptionPane.showInputDialog(this, "�ƹ� �޼��� �Է� �ϼ���",text);
			System.out.println(inputText);
		}else if(btn == btn3) {//��ư3 Ŭ��
			 int selected = JOptionPane.showConfirmDialog(this, "���� �����ұ��?");
			 System.out.println(selected);
		}
		
	}

}