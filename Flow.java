import java.awt.*;
import javax.swing.*;  
 
 class Flow
{  
JFrame f;  
JButton b1,b2,b3,b4,b5;
Flow(){  
    f=new JFrame();  
      
     b1=new JButton("1");  
     b2=new JButton("2");  
     b3=new JButton("3");  
     b4=new JButton("4");  
     b5=new JButton("5");  
              
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
    
//setting flow layout of left alignment   
    f.setLayout(new FlowLayout(FlowLayout.CENTER));  
	// only 3 allignment FlowLayout.CENTER/.LEFT/.RIGHT
      
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new Flow();  
}  
}