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

public class Jaut8 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("Nekas nav jāmaina");
	JButton b2=new JButton("Jebkāds reāls skaitlis");
	JButton b3=new JButton("Jebkāds naturāls skaitlis");
	JButton b4=new JButton("Jebkāds vesels skaitlis");
	JPanel answer=new JPanel();
	String izvele;
	boolean jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8;
	Jaut8(boolean jaut1, boolean jaut2, boolean jaut3, boolean jaut4, boolean jaut5, boolean jaut6, boolean jaut7) {
		frame = new JFrame();
		this.jaut1=jaut1;
		this.jaut2=jaut2;
		this.jaut3=jaut3;
		this.jaut4=jaut4;
		this.jaut5=jaut5;
		this.jaut6=jaut6;
		this.jaut7=jaut7;
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Jaut8.png"));
			displayField = new JLabel(image);
		
			answer.setBounds(425, 577, 315, 113);

		     
        b1.setBounds(55, 450, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 25));
        
       
        b2.setBounds(425, 450, 315, 113);
        b2.setOpaque(false);
        b2.setFont(new Font("Arial", Font.ITALIC, 25));
        
        b3.setBounds(55, 577, 315, 113);
        b3.setOpaque(false);
        b3.setFont(new Font("Arial", Font.ITALIC, 25));
        
       
        b4.setBounds(425, 577, 315, 113);
        b4.setOpaque(false);
        b4.setFont(new Font("Arial", Font.ITALIC, 25));
        
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
         
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        jaut8=false;
	        Atbilde8 Atbilde8 = new Atbilde8(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8);
	        }
		if(e.getSource()==b2) {
	        frame.dispose();
	        jaut8=false;
	        Atbilde8 Atbilde8 = new Atbilde8(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8);
		}
		if(e.getSource()==b3) {
	        frame.dispose();
	        jaut8=true;
	        Atbilde8 Atbilde8 = new Atbilde8(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8);
		}
		if(e.getSource()==b4) {
	        frame.dispose();
	        jaut8=false;
	        Atbilde8 Atbilde8 = new Atbilde8(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8);
		}
	}
//	public static void main(String[] args) {
//		Jaut8 Jaut8 = new Jaut8();
//		
//		
//	}

}
