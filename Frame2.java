import java.awt.*;

class Frame2 {
	Button b1,b2;
	Label l;
	TextField t1;
	Frame f;
	
    public static void main(String args[]) {
        f = new Frame();
		l=new Label("Enter your name");
		t1 = new TextField();
        b1 = new Button("OK");
        b2 = new Button("CANCEL");

        l.setBounds(60, 40, 130, 130);
		t1.setBounds(210,40,180,180);
        b1.setBounds(60, 220, 60, 60);
        b2.setBounds(200, 220, 60, 60);

        f.add(l);
        f.add(b1);
        f.add(b2);
		f.add(t1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}