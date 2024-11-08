import java.awt.*;
import java.awt.event.*;

class EventHandling1 extends Frame implements ActionListener {
		Button b1,b2;
		TextField t1;
		
		EventHandling1 () {
			b1=new Button("OK");
			b2=new Button("CANCEL");
			t1=new TextField();
			
			b1.setBounds(80,100,80,30);;
			b2.setBounds(240,100,80,30);
			t1.setBounds(80,210,240,150);
			
			add(b1);
			add(b2);
			add(t1);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			setSize(400,400);
			setLayout(null);
			setVisible(true);
		}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			t1.setText("Hello How are You");
		} else {
			t1.setText("   ");
		}
	}
	
	public static void main(String args[]){
	EventHandling1 eh=new EventHandling1();
	}
}