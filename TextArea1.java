import java.awt.*;

class TextArea1 extends Frame {

    TextArea1() {
        TextArea ta = new TextArea();

        ta.setBounds(50, 70, 230, 120);

        add(ta);

        setLayout(null);

        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String ar[]) {
		TextArea1 t = new TextArea1();
    }
}