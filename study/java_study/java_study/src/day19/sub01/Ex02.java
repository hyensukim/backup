package day19.sub01;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Ex02 extends JFrame {
	private JTextField tf;

	
	public Ex02() {
		super("¿¹Á¦02");
		setVisible(true);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		tf = new JTextField(30);
		add(tf);
		tf.addKeyListener(new KeyEventHandle());
		
		
	}
	public static void main(String[] args) {
		new Ex02();
	}
	/*@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KeyTyped");
	}
	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println("KeyPressed");
		int code = e.getKeyCode();
		String key = KeyEvent.getKeyText(code);
		System.out.println("code = " + code + ", key =" + key);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KeyReleased");
	}
*/
	class KeyEventHandle extends KeyAdapter{
		
	}
	
}
