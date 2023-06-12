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

public class Jaut10 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("<html>Līdz ievadīs \"X\"<br>pirmajā ievades laukā<html>");
	JButton b2=new JButton("Programma strādās 5 reizes");
	JButton b3=new JButton("Programma strādās mūžīgi");
	JButton b4=new JButton("<html>Programma strādās līdz ievadīs<br>ciparu pirmajā ievades laukā<html>");
	JPanel answer=new JPanel();
	String izvele;
	Jaut10() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Jaut10.png"));
			displayField = new JLabel(image);
		
			answer.setBounds(55, 450, 315, 113);

		     
        b1.setBounds(55, 450, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 20));
        
       
        b2.setBounds(425, 450, 315, 113);
        b2.setOpaque(false);
        b2.setFont(new Font("Arial", Font.ITALIC, 20));
        
        b3.setBounds(55, 577, 315, 113);
        b3.setOpaque(false);
        b3.setFont(new Font("Arial", Font.ITALIC, 20));
        
       
        b4.setBounds(425, 577, 315, 113);
        b4.setOpaque(false);
        b4.setFont(new Font("Arial", Font.ITALIC, 20));
        
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
	        Jaut10 Jaut10 = new Jaut10();

	        }
		if(e.getSource()==b2) {
	        frame.dispose();
		}
		
	}
	public static void main(String[] args) {
		Jaut10 Jaut10 = new Jaut10();
		
		
	}

}
