package Gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



// Creating a child class for Jframe and applying changes its used in JFrameTry2


public class myFame extends JFrame {
	
	myFame(){
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(702, 624);
		this.setTitle("Yujan");
		this.setResizable(false);
		
		// TO CHANGE the image icon
		ImageIcon img=new ImageIcon("luffy.png");
		this.setIconImage(img.getImage());  //changes the icon image
		
		//TO CHANGE the background
		this.getContentPane().setBackground(new Color(22,122,22)); //also Color.green() type can be used
		
	}
	
}
