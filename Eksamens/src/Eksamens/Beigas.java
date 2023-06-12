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
import javax.swing.SwingConstants;

public class Beigas extends JFrame implements ActionListener{
	JFrame frame;
	ImageIcon image;
	JLabel displayField;
	JButton b1=new JButton("Atgriezties uz sākumu");
	JButton b2=new JButton("Beigt");
	int sk=10;
	JLabel jautajums1, jautajums2, jautajums3, jautajums4, jautajums5, jautajums6, jautajums7, jautajums8, jautajums9, jautajums10, Pareizi, Punkti;
	boolean jaut1, jaut2, jaut3, jaut4, jaut5,jaut6,jaut7,jaut8, jaut9, jaut10;
	Beigas(boolean jaut1, boolean jaut2, boolean jaut3, boolean jaut4, boolean jaut5, boolean jaut6, boolean jaut7, boolean jaut8, boolean jaut9, boolean jaut10) {

		jautajums1=new JLabel("1.Kurš ir pēcnosacījuma cikls?");
		jautajums2=new JLabel("2.Kurš no pēcnosacījuma cikliem strādās mūžīgi?");
		jautajums3=new JLabel("3.Ko izdrukās programma?");
		jautajums4=new JLabel("4.Cik reizes programma izdrukās \"aaa\"?");
		jautajums5=new JLabel("5.Cik reizes tiks iedarbināts iekšējais cikls?");
		jautajums6=new JLabel("6.Cik reizes strādās cikls?");
		jautajums7=new JLabel("7.Kurš no pēcnosacījuma cikliem izdrukās mainīgo sk 3 reizes?");
		jautajums8=new JLabel("8.Kas ir jāieraksta koda 10. rindā, lai cikls nestrādātu mūžīgi?");
		jautajums9=new JLabel("9.Ko izdrukās programma?");
		jautajums10=new JLabel("10.Ko izdrukās programma?");
		Pareizi=new JLabel("Visu atbildēji pareizi!");
		
		
		
		
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
		
		
		
		jautajums1.setBounds(30, 150, 700, 50);
        jautajums1.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums2.setBounds(30, 190, 700, 50);
        jautajums2.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums3.setBounds(30, 230, 700, 50);
        jautajums3.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums4.setBounds(30, 270, 700, 50);
        jautajums4.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums5.setBounds(30, 310, 700, 50);
        jautajums5.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums6.setBounds(30, 350, 700, 50);
        jautajums6.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums7.setBounds(30, 390, 720, 50);
        jautajums7.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums8.setBounds(30, 430, 700, 50);
        jautajums8.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums9.setBounds(30, 470, 700, 50);
        jautajums9.setFont(new Font("Arial", Font.ITALIC, 30));
        
        jautajums10.setBounds(30, 510, 700, 50);
        jautajums10.setFont(new Font("Arial", Font.ITALIC, 30));
        
        Pareizi.setBounds(30, 300, 700, 60);
        Pareizi.setFont(new Font("Arial", Font.ITALIC, 40));
		

		
       

        

		
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			image = new ImageIcon(getClass().getResource("/bildes/Beigas.png"));
			displayField = new JLabel(image);
		  
		     
        b1.setBounds(55, 600, 315, 113);
        b1.setOpaque(false);
        b1.setFont(new Font("Arial", Font.ITALIC, 25));
        
       
        b2.setBounds(425, 600, 315, 113);
        b2.setOpaque(false);
        b2.setFont(new Font("Arial", Font.ITALIC, 25));
        
		
		

       
		
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        frame.add(b2);
        
        if(jaut1==false) {
			frame.add(jautajums1);
			sk--;
		}
		if(jaut2==false) {
			frame.add(jautajums2);
			sk--;
		}
		if(jaut3==false) {
			frame.add(jautajums3);
			sk--;
		}
		if(jaut4==false) {
			frame.add(jautajums4);
			sk--;
		}
		if(jaut5==false) {
			sk--;
			frame.add(jautajums5);
		}
		if(jaut6==false) {
			frame.add(jautajums6);
			sk--;
		}
		if(jaut7==false) {
			frame.add(jautajums7);
			sk--;
		}
		if(jaut8==false) {
			frame.add(jautajums8);
			sk--;
		}
		if(jaut9==false) {
			frame.add(jautajums9);
			sk--;
		}
		if(jaut10==false) {
			frame.add(jautajums10);
			sk--;
		}
		
		if(jaut1==true && jaut2==true && jaut3==true && jaut4==true && jaut5==true && jaut6==true && jaut7==true && jaut8==true && jaut9==true && jaut10==true) {
			sk=10;
			frame.add(Pareizi);
		}
		String skaits= Integer.toString(sk);
		Punkti = new JLabel(skaits);
		 Punkti.setBounds(370, 30, 100, 60);
	        Punkti.setFont(new Font("Arial", Font.ITALIC, 40));
		frame.add(Punkti);
        frame.add(b1);
        
        frame.add(displayField);
        frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
         
	}
	
	
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
	        frame.dispose();
	        SakumaEkrans sakums = new SakumaEkrans();

	        }
		if(e.getSource()==b2) {
	        frame.dispose();
		}
		
		
		
	}

}
