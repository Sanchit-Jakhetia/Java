import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {
    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        JLabel LTitle = new JLabel("Registration Form in ...");
        LTitle.setFont(new Font("Arial", Font.BOLD, 20));
        LTitle.setBounds(100, 10, 300, 30);
        panel.add(LTitle);

        JLabel LName = new JLabel("Name:");
        LName.setBounds(50, 50, 100, 20);
        panel.add(LName);

        JTextField TName = new JTextField();
        TName.setBounds(150, 50, 150, 20);
        panel.add(TName);

        JLabel LEmail = new JLabel("Email-ID:");
        LEmail.setBounds(50, 80, 100, 20);
        panel.add(LEmail);

        JTextField TEmail = new JTextField();
        TEmail.setBounds(150, 80, 150, 20);
        panel.add(TEmail);

        JLabel LPass = new JLabel("Create Password:");
        LPass.setBounds(50, 110, 120, 20);
        panel.add(LPass);

        JPasswordField TPass = new JPasswordField();
        TPass.setBounds(150, 110, 150, 20);
        panel.add(TPass);

        JLabel LState = new JLabel("State:");
        LState.setBounds(50, 140, 100, 20);
        panel.add(LState);

        JTextField txtState = new JTextField();
        txtState.setBounds(150, 140, 150, 20);
        panel.add(txtState);

        JLabel lblPhone = new JLabel("Phone No:");
        lblPhone.setBounds(50, 170, 100, 20);
        panel.add(lblPhone);

        JTextField txtPhone = new JTextField();
        txtPhone.setBounds(150, 170, 150, 20);
        panel.add(txtPhone);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 210, 80, 25);
        panel.add(btnSubmit);

        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(200, 210, 80, 25);
        panel.add(btnClear);

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TName.setText("");
                TEmail.setText("");
                TPass.setText("");
                txtState.setText("");
                txtPhone.setText("");
            }
        });

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Form Submitted");
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
