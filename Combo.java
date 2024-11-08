import javax.swing.*; 
import java.awt.event.*; 
 class Combo implements ItemListener
{  
JFrame f;  
   Combo()
    {  
    f=new JFrame("Combo Example");  
      
    String country[]={"India","Australia","U.S.A","England","Newzeland"};  
      
    JComboBox cb=new JComboBox(country);  
    cb.setBounds(50, 50,90,20);  
    //cb.setEditable(true);
    cb.addItemListener(this); 	 	
    f.add(cb);  
      
    f.setLayout(null);  
    f.setSize(400,500);  
    f.setVisible(true);  
      
   }  

 	public void itemStateChanged(ItemEvent e) 
	{
        	if (e.getStateChange() == ItemEvent.SELECTED)
	 	{
         	
		String str=(String)e.getItem();
		JOptionPane.showMessageDialog(f,str);
    		}
	}

  public static void main(String[] args)
    {  
    new Combo();  
      
   }  
}