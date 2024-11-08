import java.awt.*;

class List1 extends Frame {

    List1() {
			List l1 = new List();

			l1.add("India");
			l1.add("Japan");
			l1.add("America");

			l1.setMultipleMode(true);
			
			add(l1);
			setLayout(new FlowLayout());
			setSize(400,400);
			setVisible(true);
		}
	public static void main(String args[]) {
		List1 l1=new List1();
	}
}