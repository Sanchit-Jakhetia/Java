import java.awt.*;  
import javax.swing.*;  
  
 class Box1  {  
 JButton bt[]; 
JFrame f; 
  
 Box1 ()
  {  
   f= new JFrame();
   bt = new JButton [5];  
    
   for (int i = 0;i<5;i++) 
     {  
      bt[i] = new JButton ("Button " + (i + 1));  
      f.add (bt[i]);  
     }  
  
f.setLayout (new BoxLayout(f.getContentPane(), BoxLayout.X_AXIS));  
f.setSize(600,400);  
f.setVisible(true); 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }  
  
public static void main(String args[])
  {  
Box1 b=new Box1();  
  }  
}