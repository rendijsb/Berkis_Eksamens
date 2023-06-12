package Eksamens;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jaut2 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image, image1, image2, image3, image4;
	JLabel displayField, displayField1, displayField2, displayField3, displayField4;
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();
	JButton b4=new JButton();
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JPanel answer=new JPanel();
	String izvele;
	boolean jaut2, jaut1;
	Jaut2(boolean jaut1) {
		frame = new JFrame();
		jaut1=this.jaut1;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/Bildes/Jaut2.png"));
			displayField = new JLabel(image);
		

			
			image1 = new ImageIcon(getClass().getResource("/Bildes/Atbilde1(Jaut2).png"));
			displayField1 = new JLabel(image1);
			panel1.add(displayField1);
			panel1.setVisible(true);
			
			panel1.setBounds(55, 400, 295, 100);
			
			
			image2 = new ImageIcon(getClass().getResource("/Bildes/Atbilde2(Jaut2).png"));
			displayField2 = new JLabel(image2);
			panel2.add(displayField2);
			panel2.setVisible(true);
			
			panel2.setBounds(425, 400, 295, 100);
			
			
			image3 = new ImageIcon(getClass().getResource("/Bildes/Atbilde3(Jaut2).png"));
			displayField3 = new JLabel(image3);
			panel3.add(displayField3);
			panel3.setVisible(true);
			
			panel3.setBounds(55, 580, 295, 100);
			
			
			image4 = new ImageIcon(getClass().getResource("/Bildes/Atbilde4(Jaut2).png"));
			displayField4 = new JLabel(image4);
			answer.add(displayField4);
			answer.setVisible(true);
			
			answer.setBounds(425, 580, 295, 100);
			
			
		     
        b1.setBounds(55, 400, 295, 100);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        
       
        b2.setBounds(425, 400, 295, 100);
        b2.setOpaque(false);
        b2.setFont(new Font("Arial", Font.ITALIC, 30));
        
        b3.setBounds(55, 580, 295, 100);
        b3.setOpaque(false);
        b3.setFont(new Font("Arial", Font.ITALIC, 30));
        
       
        b4.setBounds(425, 580, 295, 100);
        b4.setOpaque(false);
        b4.setFont(new Font("Arial", Font.ITALIC, 30));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        
        
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        
        b4.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        
        frame.add(b1);

        frame.add(panel1);  
        frame.add(panel2); 
        frame.add(panel3); 
        frame.add(answer); 
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        jaut2=false;
	        Atbilde2 Atbilde2 = new Atbilde2(jaut1, jaut2);
	        }
		if(e.getSource()==b2) {
	        frame.dispose();
	        jaut2=false;
	        Atbilde2 Atbilde2 = new Atbilde2(jaut1, jaut2);
		}
		if(e.getSource()==b3) {
	        frame.dispose();
	        jaut2=false;
	        Atbilde2 Atbilde2 = new Atbilde2(jaut1, jaut2);
		}
		if(e.getSource()==b4) {
	        frame.dispose();
	        jaut2=true;
	        Atbilde2 Atbilde2 = new Atbilde2(jaut1, jaut2);
		}
		
	}
//	public static void main(String[] args) {
//		Jaut2 Jaut2 = new Jaut2(jaut2);
//		
//		
//	}

}
