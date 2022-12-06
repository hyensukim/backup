package day19;

import java.awt.*;
import javax.swing.*;
public class Ex05 extends JFrame{

	public Ex05() {
		super("����05");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add("North",new JLabel("���̺�",SwingConstants.CENTER));
		
		String[] headers = {"�׸�1","�׸�2","�׸�3"};
		Integer[][] rowData = {{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6},{7,8,9}};
		JTable table = new JTable(rowData,headers);
		JScrollPane jsp = new  JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add("Center",jsp);
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
