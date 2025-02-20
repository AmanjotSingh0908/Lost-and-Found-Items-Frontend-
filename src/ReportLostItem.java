import javax.swing.*;

public class ReportLostItem {
    public ReportLostItem() {
        JFrame frame = new JFrame("Report Lost Item");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        // Labels & Fields
        JLabel nameLabel = new JLabel("Item Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);

        JLabel descLabel = new JLabel("Description:");
        descLabel.setBounds(50, 100, 100, 30);
        JTextArea descArea = new JTextArea();
        descArea.setBounds(150, 100, 200, 60);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 200, 100, 30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(descLabel);
        frame.add(descArea);
        frame.add(submitButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ReportLostItem();
    }
}
