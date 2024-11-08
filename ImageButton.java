import javax.swing.*;
import java.awt.event.*;

public class ImageButton {
	ImageButton() {
		JFrame f = new JFrame();
		JButton b = new JButton(new ImageIcon("Button.png"));
		b.setBounds(100,150,100,40);
		f.add(b);
		f.setSize(300,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
	new ImageButton();
	}
}