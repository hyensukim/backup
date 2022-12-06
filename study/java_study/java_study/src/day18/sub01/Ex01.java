package day18.sub01;

import java.awt.*;
import javax.swing.*;
public class Ex01 extends JFrame{
	
	public Ex01() {
		super("연습01");
		setVisible(true);//
		setSize(300,400);//
		setDefaultCloseOperation(EXIT_ON_CLOSE);// 
		
		setLayout(new FlowLayout());
		for(int i = 0; i < 10; i++) {
			add(new Button("버튼"+i));
		}
	}
	
	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01();

	}

}
