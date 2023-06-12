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
import javax.swing.JTextField;

public class Atbilde5 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("Turpināt");
	String izvele;
	JLabel pareizs,nepareizs;
	boolean jaut1, jaut2, jaut3, jaut4, jaut5;
	
	Atbilde5(boolean jaut1, boolean jaut2, boolean jaut3, boolean jaut4, boolean jaut5) {
		this.jaut1=jaut1;
		this.jaut2=jaut2;
		this.jaut3=jaut3;
		this.jaut4=jaut4;
		this.jaut5=jaut5;
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Atbilde5.png"));
			displayField = new JLabel(image);
			
				pareizs=new JLabel("<html>Apsveicu! Jūs atbildējāt pareizi!\n"
						+ "<br>Pareizā atbilde patiešām bija:<html>");  
			    pareizs.setBounds(150,100, 500,80);  
			    pareizs.setFont(new Font("Arial", Font.ITALIC, 35));
			    
			    nepareizs=new JLabel("<html>Jūs diemžēl atbildējāt nepareizi:"
			    		+"<br>Pareizā atbilde tomēr bija:<html>");  
			    nepareizs.setBounds(150,100, 500,80);  
			    nepareizs.setFont(new Font("Arial", Font.ITALIC, 35));

		     
        b1.setBounds(240, 550, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        
        
        b1.addActionListener(this);
      
        
        
//        b1.setContentAreaFilled(false);
//        b1.setBorderPainted(false);
        
        frame.add(b1);
        
        if(jaut5==false) {
        frame.add(nepareizs);
        }else {

        	frame.add(pareizs);
        }
        
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        Jaut6 Jaut6 = new Jaut6(jaut1, jaut2, jaut3, jaut4, jaut5);
	        }
		
	}
//	public static void main(String[] args) {
//		Atbilde1 Atbilde1 = new Atbilde1(jaut1);
//		
//		
//	}

}
