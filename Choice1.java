import java.awt.*;
class Choice1 extends Frame {

    Choice1() {
        Choice c = new Choice();

        c.add("India");
        c.add("Japan");
        c.add("America");

        c.setBounds(60, 120, 70, 180);

        add(c);

        setLayout(null);

        setSize(400, 400);
        setVisible(true);
    }
	
	public static void main(String args[]) {
		Choice1 c = new Choice1();
	}
}