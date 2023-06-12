package Eksamens;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jaut9 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("12345");
	JButton b2=new JButton("19046");
	JButton b3=new JButton("64091");
	JButton b4=new JButton("1, 9, 0, 4, 6");
	JPanel answer=new JPanel();
	String izvele;
	boolean jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9;
	Jaut9(boolean jaut1, boolean jaut2, boolean jaut3, boolean jaut4, boolean jaut5, boolean jaut6, boolean jaut7, boolean jaut8) {
		frame = new JFrame();
		this.jaut1=jaut1;
		this.jaut2=jaut2;
		this.jaut3=jaut3;
		this.jaut4=jaut4;
		this.jaut5=jaut5;
		this.jaut6=jaut6;
		this.jaut7=jaut7;
		this.jaut8=jaut8;
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Jaut9.png"));
			displayField = new JLabel(image);
		
			answer.setBounds(55, 577, 315, 113);

		     
        b1.setBounds(55, 450, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        
       
        b2.setBounds(425, 450, 315, 113);
        b2.setOpaque(false);
        b2.setFont(new Font("Arial", Font.ITALIC, 30));
        
        b3.setBounds(55, 577, 315, 113);
        b3.setOpaque(false);
        b3.setFont(new Font("Arial", Font.ITALIC, 30));
        
       
        b4.setBounds(425, 577, 315, 113);
        b4.setOpaque(false);
        b4.setFont(new Font("Arial", Font.ITALIC, 30));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        
        
//        b1.setContentAreaFilled(false);
//        b1.setBorderPainted(false);
        
        frame.add(b1);
      
        answer.setBackground(Color.GREEN);
        frame.add(answer);  
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         System.out.println(jaut1);
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        jaut9=false;
	        Atbilde9 Atbilde9 = new Atbilde9(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9);
	        }
		if(e.getSource()==b2) {
	        frame.dispose();
	        jaut9=false;
	        Atbilde9 Atbilde9 = new Atbilde9(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9);
		}
		if(e.getSource()==b3) {
	        frame.dispose();
	        jaut9=true;
	        Atbilde9 Atbilde9 = new Atbilde9(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9);
		}
		if(e.getSource()==b4) {
	        frame.dispose();
	        jaut9=false;
	        Atbilde9 Atbilde9 = new Atbilde9(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9);
		}

}
}
