package c_basketlist;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ex03 extends JFrame{
	public Ex03() {
		super();
		
		
		
		
		
		
		

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
 public static void main(String[] args) {
	new Ex03();
	
}
}
