import java.awt.*;
import javax.swing.*;  
class Border 
{  
JFrame f; 
JButton b1,b2,b3,b4,b5; 
Border()
  {  
    f=new JFrame();  
    b1=new JButton("NORTH");  
    b2=new JButton("SOUTH"); 
    b3=new JButton("EAST");  
    b4=new JButton("WEST");  
    b5=new JButton("CENTER"); 
      
    f.add(b1,BorderLayout.NORTH);  
    f.add(b2,BorderLayout.SOUTH);  
    f.add(b3,BorderLayout.EAST);  
    f.add(b4,BorderLayout.WEST);  
    f.add(b5,BorderLayout.CENTER);  
      
    f.setSize(300,300);  
    f.setVisible(true);  
  }  
public static void main(String[] args)
  {  
    Border b = new Border();  
  }  
}