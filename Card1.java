import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
 class Card1 extends JFrame implements ActionListener
{  
CardLayout card;  
JButton b1,b2,b3;  
Container c;  
    Card1(){  
          
        c=getContentPane();  
        card=new CardLayout(40,30);  
//create CardLayout object with 40 hozr space and 30 vert space  
        c.setLayout(card);  
          
        b1=new JButton("Apple");  
        b2=new JButton("Boy");  
        b3=new JButton("Cat");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
              
        c.add(b1);c.add(b2);c.add(b3);  
                          
    }  
    public void actionPerformed(ActionEvent e)
    {  
    card.next(c);  
    }  
  
    public static void main(String[] args) 
     {  
        Card1 cl=new Card1();  
        cl.setSize(600,400);  
        cl.setVisible(true);  
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);  
      }  
}