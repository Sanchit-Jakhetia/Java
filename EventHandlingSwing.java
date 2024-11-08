//import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class EventHandlingSwing implements ActionListener {
		JButton b1,b2;
		JTextField t1;
		JFrame f;
		
		EventHandlingSwing () {
			b1=new JButton("OK");
			b2=new JButton("CANCEL");
			t1=new JTextField();
			f=new JFrame();
			
			b1.setBounds(90,100,90,30);;
			b2.setBounds(270,100,90,30);
			t1.setBounds(90,210,270,100);
			
			f.add(b1);
			f.add(b2);
			f.add(t1);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			f.setSize(450,450);
			f.setLayout(null);
			f.setVisible(true);
		}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			t1.setText("Hello How are You");
		} else {
			t1.setText("   ");
		}
	}
	
	public static void main(String args[]){
	EventHandlingSwing eh=new EventHandlingSwing();
	}
}