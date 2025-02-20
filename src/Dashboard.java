import javax.swing.*;
import java.awt.*;

public class Dashboard {
    public Dashboard() {
        JFrame frame = new JFrame("Dashboard - Lost & Found");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 240, 240)); // Light Gray

        // 🔵 HEADER
        JLabel headerLabel = new JLabel("Lost & Found Dashboard", SwingConstants.CENTER);
        headerLabel.setBounds(0, 10, 600, 30);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setOpaque(true);
        headerLabel.setBackground(new Color(0, 102, 204));

        // Buttons
        JButton reportLostButton = new JButton("Report Lost Item");
        reportLostButton.setBounds(200, 60, 200, 30);
        reportLostButton.setBackground(new Color(0, 153, 76)); // Green Button
        reportLostButton.setForeground(Color.WHITE);
        reportLostButton.addActionListener(e -> new ReportLostItem());

        JButton reportFoundButton = new JButton("Report Found Item");
        reportFoundButton.setBounds(200, 100, 200, 30);
        reportFoundButton.setBackground(new Color(0, 153, 76));
        reportFoundButton.setForeground(Color.WHITE);
        reportFoundButton.addActionListener(e -> new ReportFoundItem());

        JButton viewItemsButton = new JButton("View Lost & Found Items");
        viewItemsButton.setBounds(200, 140, 200, 30);
        viewItemsButton.setBackground(new Color(0, 153, 76));
        viewItemsButton.setForeground(Color.WHITE);
        viewItemsButton.addActionListener(e -> new ViewItems());

        // 🔴 LOGOUT Button (Goes back to LoginPage)
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(450, 320, 100, 30);
        logoutButton.setBackground(new Color(204, 0, 0));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.addActionListener(e -> {
            frame.dispose(); // Close dashboard
            new LoginPage(); // Open login page
        });

        // 🔴 FOOTER
        JLabel footerLabel = new JLabel("© 2025 Lost & Found System", SwingConstants.CENTER);
        footerLabel.setBounds(0, 340, 600, 30);
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));

        // Add components
        frame.add(headerLabel);
        frame.add(reportLostButton);
        frame.add(reportFoundButton);
        frame.add(viewItemsButton);
        frame.add(logoutButton);
        frame.add(footerLabel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
