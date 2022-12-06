package day19;

import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Ex06 extends JFrame implements ActionListener{
	public Ex06() {
		super("예제06");
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar jmb = new JMenuBar();
		JMenu menu1 = new JMenu("메뉴");
		JMenuItem mItem = new JMenuItem("파일");
		
		menu1.add(mItem);
		jmb.add(menu1);
		setJMenuBar(jmb);
	
		mItem.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser file = new  JFileChooser();
		file.showOpenDialog(this);
		File fileName = file.getSelectedFile();
		System.out.println(fileName.getName());
	}
}
