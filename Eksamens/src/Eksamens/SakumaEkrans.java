package Eksamens;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SakumaEkrans extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("Sākt testu");
	JButton b2=new JButton("Beigt");
	JButton b3=new JButton("Noteikumi");
	JPanel panel=new JPanel();
	String izvele;
	SakumaEkrans() {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/SakumaEkrans.png"));
			displayField = new JLabel(image);
		  
		     
        b1.setBounds(55, 577, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 30));
        
       
        b2.setBounds(425, 577, 315, 113);
        b2.setOpaque(false);
        b2.setFont(new Font("Arial", Font.ITALIC, 30));
        
        b3.setBounds(240, 450, 315, 113);
        b3.setOpaque(false);
        b3.setFont(new Font("Arial", Font.ITALIC, 30));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        frame.add(b2);
        frame.add(b3);
        
        
//        b1.setContentAreaFilled(false);
//        b1.setBorderPainted(false);
        
        frame.add(b1);
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
		
		if(e.getSource()==b3) {
	        JOptionPane.showMessageDialog(null, "Tests sastāv no 10 jautājumiem.\n"
	        		+ "Katram jautājumam ir 4 atbilžu varianti\n"
	        		+ "Katram jautājumam ir 1 pareiza atbilde\n"
	        		+ "Pareizā atbilde tiks izdrukāta uzreiz pēc atbilžu iesniegšanas\n"
	        		+ "Jautājumi uz kuriem atbildēts nepareizi, tiks izdrukāti testa beigās","Noteikumi:", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	public static void main(String[] args) {
		SakumaEkrans SakumaEkrans = new SakumaEkrans();
		
		
	}

}
