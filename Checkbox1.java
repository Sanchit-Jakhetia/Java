import java.awt.*;
class Checkbox1 extends Frame
{
	Checkbox1()
	{
	Checkbox c1 = new Checkbox("Cream");
	Checkbox c2 = new Checkbox("Sugar");
	Checkbox c3 = new Checkbox("Flour");
	c1.setBounds(150,80,60,60);
	c2.setBounds(150,180,60,60);
	c3.setBounds(150,280,60,60);


	add(c1);
	add(c2);
	add(c3);
	setLayout(null);
        setSize(400,400);
	setVisible(true);
	}
	  public static void main(String ar[])
	   {
	   Checkbox1 cb=new Checkbox1();
	   }
}