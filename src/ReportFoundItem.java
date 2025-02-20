import javax.swing.*;

public class ReportFoundItem {
    public ReportFoundItem() {
        JFrame frame = new JFrame("Report Found Item");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        // 🔵 HEADER
        JLabel headerLabel = new JLabel("Report Found Item", SwingConstants.CENTER);
        headerLabel.setBounds(0, 10, 400, 30);

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

        // 🔴 FOOTER
        JLabel footerLabel = new JLabel("© 2025 Lost & Found System", SwingConstants.CENTER);
        footerLabel.setBounds(0, 340, 400, 30);

        // Add components
        frame.add(headerLabel);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(descLabel);
        frame.add(descArea);
        frame.add(submitButton);
        frame.add(footerLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ReportFoundItem();
    }
}
