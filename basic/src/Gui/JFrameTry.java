package Gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameTry {

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(512, 324);
		frame.setTitle("Yujan");
		frame.setResizable(false);
		
		// TO CHANGE the image icon
		ImageIcon img=new ImageIcon("luffy.png");
		frame.setIconImage(img.getImage());  //changes the icon image
		
		//TO CHANGE the background
		frame.getContentPane().setBackground(new Color(222,122,22)); //also Color.green() type can be used
		
	}

}
