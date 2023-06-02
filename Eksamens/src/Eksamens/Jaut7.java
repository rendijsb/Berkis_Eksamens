package Eksamens;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jaut7 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image, image1, image2, image3, image4;
	JLabel displayField, displayField1, displayField2, displayField3, displayField4;
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();
	JButton b4=new JButton();
	JPanel panel1=new JPanel();
	JPanel answer=new JPanel();
	JPanel panel3=new JPanel();
	JPanel panel4=new JPanel();
	String izvele;
	Jaut7() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/Bildes/Jaut7.png"));
			displayField = new JLabel(image);
		

			
			image1 = new ImageIcon(getClass().getResource("/Bildes/Atbilde1(Jaut7).png"));
			displayField1 = new JLabel(image1);
			panel1.add(displayField1);
			panel1.setVisible(true);
			
			panel1.setBounds(55, 400, 295, 100);
			
			
			image2 = new ImageIcon(getClass().getResource("/Bildes/Atbilde2(Jaut7).png"));
			displayField2 = new JLabel(image2);
			answer.add(displayField2);
			answer.setVisible(true);
			
			answer.setBounds(425, 400, 295, 100);
			
			
			image3 = new ImageIcon(getClass().getResource("/Bildes/Atbilde3(Jaut7).png"));
			displayField3 = new JLabel(image3);
			panel3.add(displayField3);
			panel3.setVisible(true);
			
			panel3.setBounds(55, 580, 295, 100);
			
			
			image4 = new ImageIcon(getClass().getResource("/Bildes/Atbilde4(Jaut7).png"));
			displayField4 = new JLabel(image4);
			panel4.add(displayField4);
			panel4.setVisible(true);
			
			panel4.setBounds(425, 580, 295, 100);
			
			
		     
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
        frame.add(answer); 
        frame.add(panel3); 
        frame.add(panel4); 
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        Jaut7 Jaut7 = new Jaut7();

	        }
		if(e.getSource()==b2) {
	        frame.dispose();
		}
		
	}
	public static void main(String[] args) {
		Jaut7 Jaut7 = new Jaut7();
		
		
	}

}
