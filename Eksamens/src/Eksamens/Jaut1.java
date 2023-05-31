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

public class Jaut1 extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("while(){}do;");
	JButton b2=new JButton("do{while();");
	JButton b3=new JButton("do{}while();");
	JButton b4=new JButton("do{}while;");
	JPanel panel=new JPanel();
	String izvele;
	Jaut1() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Jaut1.png"));
			displayField = new JLabel(image);
		
			panel.setBounds(55, 377, 315, 113);

		     
        b1.setBounds(55, 377, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        
       
        b2.setBounds(425, 377, 315, 113);
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
        
        
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        
        frame.add(b1);
      
        panel.setBackground(Color.RED);
        frame.add(panel);  
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        Jaut1 Jaut1 = new Jaut1();

	        }
		if(e.getSource()==b2) {
	        frame.dispose();
		}
		
	}
	public static void main(String[] args) {
		Jaut1 Jaut1 = new Jaut1();
		
		
	}

}
