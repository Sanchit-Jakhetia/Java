import javax.swing.*;
import java.awt.event.*;

 class MessageDialogDemo implements ActionListener
  {
  
   JFrame f;
   JButton b;
  	MessageDialogDemo()
	{
  	f = new JFrame("Show Message Dialog");
   	b= new JButton("Click Me");
  	b.addActionListener(this);
  	f.add(b);
  	f.setSize(400, 400);
  	f.setVisible(true);
  	//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	}

   	public void actionPerformed(ActionEvent e)
	{
  	JOptionPane.showMessageDialog(null,"This is Message Dialog Box");
  	}
	  public static void main(String[] args)
	   {
  	   MessageDialogDemo md= new MessageDialogDemo();
  	   }
  }