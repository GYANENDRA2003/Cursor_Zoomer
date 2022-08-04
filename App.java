import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class App {
	JFrame fr=new JFrame("NIET");
	JLabel la=new JLabel("NIET COLLEGE");
	public App() {
		fr.setSize(400,300);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3); ///for stoping the JVM when we pass zero then it will never cross
		fr.setLayout(new FlowLayout());
		fr.add(la);
		la.addMouseListener(new AA());
		fr.setVisible(true);
	}
	class AA implements MouseListener{
		Font fo;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			fo=la.getFont();
			la.setFont(new Font("arial",0,30));
			la.setForeground(Color.red);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			la.setFont(fo);
			
			la.setForeground(Color.black);
		}
		
	}
	public static void main(String args[]) {
		new App();
	}
	

}




