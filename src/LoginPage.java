import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login - Lost & Found System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Username label and text field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        JTextField userField = new JTextField();
        userField.setBounds(150, 50, 150, 30);

        // Password label and password field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 150, 30);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);

        // Login action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                    frame.dispose(); // Close login window
                    new Dashboard(); // Open dashboard
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.setVisible(true);
    }
}


