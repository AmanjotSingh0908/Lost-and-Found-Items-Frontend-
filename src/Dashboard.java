import javax.swing.*;

public class Dashboard {
    public Dashboard() {
        JFrame frame = new JFrame("Dashboard - Lost & Found");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Welcome Label
        JLabel welcomeLabel = new JLabel("Welcome to the Lost & Found System!");
        welcomeLabel.setBounds(50, 50, 400, 30);

        // Buttons for navigation
        JButton reportLostButton = new JButton("Report Lost Item");
        reportLostButton.setBounds(50, 100, 200, 30);

        JButton reportFoundButton = new JButton("Report Found Item");
        reportFoundButton.setBounds(50, 150, 200, 30);

        JButton viewItemsButton = new JButton("View Lost & Found Items");
        viewItemsButton.setBounds(50, 200, 200, 30);

        // Add components to frame
        frame.add(welcomeLabel);
        frame.add(reportLostButton);
        frame.add(reportFoundButton);
        frame.add(viewItemsButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
