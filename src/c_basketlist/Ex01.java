package c_basketlist;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ex01 extends JFrame{
	JPanel jp1 ,jp2, jp3 ,jp4 ,jp5, jp6,jp7,  order1,order2,order3,order4,order5,order6 ;
	JTextField jtf1 , jtf2, jtf3 ,jtf4 ,jtf5 , jtf6;
	JButton jb1 , jb2, jb3, jb4 ,jb5;
	JLabel jl1 , jl2 ;
	JTextArea ta;

	
	
	
	public Ex01() {
		super("Basket list");
		//jp1.setLayout(getLayout());
		
		jp1 = new JPanel(new GridLayout(0,1, 20,20)) ;
		jp1.setBorder(new EmptyBorder(120, 0, 50, 0));
		jl1 = new JLabel("Men                          "
				+ "        Pcs                             "
				+ "                Price");	
		
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   상품명        단가        수량        합계\n\n");
		ta.setBackground(Color.white);
		ta.setEditable(false);
		
		
		jp1.add(jl1);
		jp1.add(ta);
		
		
		
		
		jp2 = new JPanel();
		jb5 = new JButton();
		
		jb1 = new JButton("포장(1회용용기 제공)");
		jb1.setPreferredSize(new Dimension(200,200));
		jb2 = new JButton("매장(다회용기 제공)");
		jb2.setPreferredSize(new Dimension(200,200));
		jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.Y_AXIS));
		jp4 = new JPanel();
		
		jp4.setBorder(new EmptyBorder(120, 0, 50, 0));
		
		jp2.add(jb1);
		jp2.add(jb2);
		
		
		jp3 = new JPanel();
		
		jb3 = new JButton("포인트적립");
		jb3.setPreferredSize(new Dimension(300,200));
		
		jb4 = new JButton("결제하기");
		jb4.setPreferredSize(new Dimension(100,30));
		
		
		jp6 = new JPanel();
		
		jp3.add(jb3);
		jp6.add(jb4);
		
		jp4.add(jp2);
		jp5.add(jp3);
	
		
		jp5.add(jp4);
		jp5.add(jp3);
		jp5.add(jp6);
		
		jp7 = new JPanel();
		
	   jl2 = new JLabel("Basket List");
	   jl2.setFont(new Font("Arial", Font.PLAIN, 25));

	   
	  // jl2.setBounds(210, 30, 165, 250);
     //jl2.setHorizontalAlignment(JLabel.CENTER);
	   
	   jp7.add(jl2);
		
		
		
		
		
		
		
		
		//add(jp1,BorderLayout.WEST);
	  	
		add(jp1,BorderLayout.WEST);
		add(jp5, BorderLayout.CENTER);
		add(jp7,BorderLayout.NORTH);
		
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 800, 700);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
  public static void main(String[] args) {
	new Ex01();
}
}