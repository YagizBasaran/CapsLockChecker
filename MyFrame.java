package capslock_checker;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener {

	int count = 0;
	JPanel panel1 = new JPanel(new GridBagLayout());
	JPanel panel2 = new JPanel();
	
	ImageIcon onIcon = new ImageIcon("on.jpg");
	ImageIcon offIcon = new ImageIcon("off.jpg");
	
	JLabel label1 = new JLabel();

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);//400 250
		this.setLayout(new BorderLayout(0,0));
		this.addKeyListener(this);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(this.getSize());
		
		//ARKA PLAN
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setPreferredSize(this.getSize());
		
		//ÖN PLAN
		panel2.setBackground(Color.gray);
		panel2.setPreferredSize(new Dimension(300,300));
		panel2.setMaximumSize(new Dimension(300,300));
		panel2.setMinimumSize(new Dimension(300,300));
		
		//DURUM
		label1.setText("CapsLock Status");
		label1.setIcon(offIcon);
		label1.setHorizontalTextPosition(JLabel.CENTER);
		label1.setVerticalTextPosition(JLabel.TOP);
		label1.setForeground(new Color(0xEAB3CE));
		label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label1.setIconTextGap(50);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setVerticalAlignment(JLabel.CENTER);
		
		panel2.add(label1);
		
		panel1.add(panel2);
		this.add(panel1);
		
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {} // keyTyped = Invoked when a key is typed. Uses KeyChar, char output (W A S D)

	@Override
	public void keyPressed(KeyEvent e) { //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output (ARROWS, SHIFT, CAPSLOCK)
		
	
		if(e.getKeyCode() == 20 && count % 2 == 0) {
			//System.out.println("Capslock is on");
			count++;
			label1.setIcon(onIcon);
			//JOptionPane.showMessageDialog(this, "");
			
		}
		else {
			//System.out.println("Capslock is off");
			count++;
			label1.setIcon(offIcon);
			//JOptionPane.showMessageDialog(this, "");
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	 
		/*
		if(e.getKeyCode() == 20 && count % 2 != 0) {
			JOptionPane.showMessageDialog(this, "ON");
			
		}
		else {
			JOptionPane.showMessageDialog(this, "OFF");
			
		}
		*/
	}
}
