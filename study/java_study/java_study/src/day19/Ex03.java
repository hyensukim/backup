package day19;

import javax.swing.*;
import java.awt.*;
public class Ex03 extends JFrame{
	public Ex03() {
		super("�α���");
		setVisible(true);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		 BorderLayout layout = new BorderLayout();
		 setLayout(layout);
		 
		 JLabel title = new JLabel("�α���",SwingConstants.CENTER);
		 add("North",title);
		
		 JPanel loginArea = new JPanel();
//		 loginArea.setLayout(new GridLayout(1,2));
		 
		 Dimension size1 = new Dimension(50,30);
		 
		 JPanel loginInputArea = new JPanel();
		 JLabel loginTitle = new  JLabel("�α���");
		 JTextField loginInput = new JTextField(30);
		 loginInput.setSize(size1);
		 
		 JLabel passTitle = new JLabel("��й�ȣ");
		 JPasswordField passInput = new JPasswordField(30);
		 passInput.setSize(size1);
		 
		 
		 loginInputArea.add(loginTitle);
		 loginInputArea.add(loginInput);
		 loginInputArea.add(passTitle);
		 loginInputArea.add(passInput);
		 
		 loginArea.add(loginInputArea);
		 JButton loginBtn =  new JButton("�α���");
		 loginBtn.setSize(80,30);
//		 loginArea.add(new Button("�α���"));
		 
		 
		 add("Center",loginArea);
		 
		 repaint();
//		 loginInputArea.add();
		 
		 
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
