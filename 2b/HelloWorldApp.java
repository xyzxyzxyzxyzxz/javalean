import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;



public class HelloWorldApp{
	public static void main (String args[])
	{
		JFrame frame=new JFrame("JFrameDemo");
		JButton button =new JButton("sy suki");
		
		frame.getContentPane().add(button,BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}