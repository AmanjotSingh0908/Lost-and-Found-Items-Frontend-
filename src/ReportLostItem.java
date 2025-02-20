import javax.swing.*;
import java.awt.*;

public class ReportLostItem {
    public ReportLostItem() {
        JFrame frame = new JFrame("Report Lost Item");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 240, 240));

        // Header
        JLabel headerLabel = new JLabel("Report Lost Item", SwingConstants.CENTER);
        headerLabel.setBounds(0, 10, 400, 30);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setOpaque(true);
        headerLabel.setBackground(new Color(0, 102, 204));

        JLabel nameLabel = new JLabel("Item Name:");
        nameLabel.setBounds(50, 60, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 60, 200, 30);

        JLabel descLabel = new JLabel("Description:");
        descLabel.setBounds(50, 110, 100, 30);
        JTextArea descArea = new JTextArea();
        descArea.setBounds(150, 110, 200, 60);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 190, 100, 30);
        submitButton.setBackground(new Color(0, 153, 76));
        submitButton.setForeground(Color.WHITE);

        // Back Button
        JButton backButton = new JButton("Back");
        backButton.setBounds(20, 320, 100, 30);
        backButton.setBackground(new Color(204, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> frame.dispose());

        // Footer
        JLabel footerLabel = new JLabel("© 2025 Lost & Found System", SwingConstants.CENTER);
        footerLabel.setBounds(0, 340, 400, 30);
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));

        frame.add(headerLabel);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(descLabel);
        frame.add(descArea);
        frame.add(submitButton);
        frame.add(backButton);
        frame.add(footerLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ReportLostItem();
    }
}
