import java.awt.*;
class First1 {
	Button b1,b2;
	Frame f;
	First1() {
		//Button
		f=new Frame();
		b1=new Button("OK");
		b2=new Button("CANCEL");
		b1.setBounds(50,100,80,30); // setting button position (x-axis,y-axis,width,height)
		b2.setBounds(190,100,80,30); //50+80+gap[60]=190
		f.add(b1); //adding button into frame
		f.add(b2);
		//Frame
		f.setSize(300,300); //frame size 300 width and 300 height
		f.setLayout(null); //no layout manager
		f.setVisible(true); //now frame will be visible, by default not
	}
	public static void main(String args[]){
	First1 f=new First1();
	}
}