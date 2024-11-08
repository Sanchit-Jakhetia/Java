import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 class CheckboxDemo implements ActionListener 
  {
    JFrame f;
    JCheckBox cb;
    JButton b;
    CheckboxDemo() 
	{
        f = new JFrame("Test Chechbox");
        cb = new JCheckBox("JCheckBox1");

        b = new JButton("Is JCheckBox selected?");
	b.addActionListener(this);
	f.add(cb, BorderLayout.CENTER);
        f.add(b, BorderLayout.SOUTH);
       	f.pack();
	f.setSize(600,500);
        f.setVisible(true);
    	}
	  public void actionPerformed(ActionEvent ae) 
	    {
                if (cb.isSelected()) 
		{
                 JOptionPane.showMessageDialog(f, "JCheckBox is selected");
                } 
		else 
		{
                 JOptionPane.showMessageDialog(f, "JCheckBox is NOT selected");
                }
            }
        public static void main(String[] args)
	 {
          new CheckboxDemo();
         }
  }