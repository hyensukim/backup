package day19;

import javax.swing.*;
import java.awt.*;
public class Ex03 extends JFrame{
	public Ex03() {
		super("로그인");
		setVisible(true);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		 BorderLayout layout = new BorderLayout();
		 setLayout(layout);
		 
		 JLabel title = new JLabel("로그인",SwingConstants.CENTER);
		 add("North",title);
		
		 JPanel loginArea = new JPanel();
//		 loginArea.setLayout(new GridLayout(1,2));
		 
		 Dimension size1 = new Dimension(50,30);
		 
		 JPanel loginInputArea = new JPanel();
		 JLabel loginTitle = new  JLabel("로그인");
		 JTextField loginInput = new JTextField(30);
		 loginInput.setSize(size1);
		 
		 JLabel passTitle = new JLabel("비밀번호");
		 JPasswordField passInput = new JPasswordField(30);
		 passInput.setSize(size1);
		 
		 
		 loginInputArea.add(loginTitle);
		 loginInputArea.add(loginInput);
		 loginInputArea.add(passTitle);
		 loginInputArea.add(passInput);
		 
		 loginArea.add(loginInputArea);
		 JButton loginBtn =  new JButton("로그인");
		 loginBtn.setSize(80,30);
//		 loginArea.add(new Button("로그인"));
		 
		 
		 add("Center",loginArea);
		 
		 repaint();
//		 loginInputArea.add();
		 
		 
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
