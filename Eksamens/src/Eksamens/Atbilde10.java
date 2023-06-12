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

public class Atbilde10 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("Turpināt");
	String izvele;
	JLabel pareizs,nepareizs;
	boolean jaut1, jaut2, jaut3, jaut4, jaut5,jaut6,jaut7,jaut8, jaut9, jaut10;
	
	Atbilde10(boolean jaut1, boolean jaut2, boolean jaut3, boolean jaut4, boolean jaut5, boolean jaut6, boolean jaut7, boolean jaut8, boolean jaut9, boolean jaut10) {
		this.jaut1=jaut1;
		this.jaut2=jaut2;
		this.jaut3=jaut3;
		this.jaut4=jaut4;
		this.jaut5=jaut5;
		this.jaut6=jaut6;
		this.jaut7=jaut7;
		this.jaut8=jaut8;
		this.jaut9=jaut9;
		this.jaut10=jaut10;
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Atbilde10.png"));
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
        
        if(jaut10==false) {
        frame.add(nepareizs);
        }else {

        	frame.add(pareizs);
        }
        
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         System.out.println(jaut1);
	}
	

	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        Beigas Beigas = new Beigas(jaut1, jaut2, jaut3, jaut4, jaut5, jaut6, jaut7, jaut8, jaut9, jaut10);
	        }
		
	}
//	public static void main(String[] args) {
//		Atbilde1 Atbilde1 = new Atbilde1(jaut1);
//		
//		
//	}

}
