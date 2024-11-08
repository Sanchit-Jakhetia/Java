import javax.swing.*;  
import java.awt.event.*;  
class RadioDemo extends JFrame implements ActionListener
 {  
JRadioButton rb1,rb2;  
JButton b;  

    RadioDemo()
    {  
  
  rb1=new JRadioButton("Male");  
  rb1.setBounds(100,50,100,30);  
  
  rb2=new JRadioButton("Female");  
  rb2.setBounds(100,100,100,30);  
  
  ButtonGroup bg=new ButtonGroup();  
  bg.add(rb1);bg.add(rb2);  
  
  b=new JButton("click");  
  b.setBounds(100,150,80,30);  
  b.addActionListener(this);  
  
  add(rb1);add(rb2);add(b);  
  
  setSize(600,600);  
  setLayout(null);  
  setVisible(true);  
  }  

  public void actionPerformed(ActionEvent e)
   {  
	if(rb1.isSelected())
	{  
  	JOptionPane.showMessageDialog(this,"You are male");  
	}  
	if(rb2.isSelected())
	 {  
	  JOptionPane.showMessageDialog(null,"You are female");  
	 }  
   }  

   public static void main(String args[])
   {  
   new RadioDemo();  
   } 
 }