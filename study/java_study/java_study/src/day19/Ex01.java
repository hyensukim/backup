package day19;

import javax.swing.*;

public class Ex01 extends JFrame{
	
	public Ex01() {
		super("����01");
		setVisible(true);
		setSize(300,400);
		add(new JButton("�׽�Ʈ!"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
