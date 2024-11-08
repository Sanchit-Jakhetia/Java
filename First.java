import java.awt.*;
class First extends Frame {
	Button b1,b2;
	First() {
		//Button
		b1=new Button("OK");
		b2=new Button("CANCEL");
		b1.setBounds(50,100,80,30); // setting button position (x-axis,y-axis,width,height)
		b2.setBounds(190,100,80,30); //50+80+gap[60]=190
		add(b1); //adding button into frame
		add(b2);
		//Frame
		setSize(300,300); //frame size 300 width and 300 height
		setLayout(null); //no layout manager
		setVisible(true); //now frame will be visible, by default not
	}
	public static void main(String args[]){
	First f=new First();
	}
}