//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//
//public class ViewItems {
//    public ViewItems() {
//        JFrame frame = new JFrame("Lost & Found Items");
//        frame.setSize(600, 400);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        // Column names
//        String[] columns = {"Item Name", "Description", "Status"};
//
//        // Sample data
//        String[][] data = {
//                {"Laptop", "Black Dell Laptop", "Lost"},
//                {"Wallet", "Brown Leather Wallet", "Found"}
//        };
//
//        JTable table = new JTable(new DefaultTableModel(data, columns));
//        JScrollPane scrollPane = new JScrollPane(table);
//        frame.add(scrollPane);
//
//
//
//        frame.setVisible(true);
//
//    }
//
//    public static void main(String[] args) {
//        new ViewItems();
//    }
//}
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewItems {
    public ViewItems() {
        JFrame frame = new JFrame("Lost & Found Items");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Header
        JLabel headerLabel = new JLabel("Lost & Found Items", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setOpaque(true);
        headerLabel.setBackground(new Color(0, 102, 204));
        frame.add(headerLabel, BorderLayout.NORTH);

        // Column names
        String[] columns = {"Item Name", "Description", "Status"};

        // Sample data
        String[][] data = {
                {"Laptop", "Black Dell Laptop", "Lost"},
                {"Wallet", "Brown Leather Wallet", "Found"}
        };

        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Footer
        JLabel footerLabel = new JLabel("© 2025 Lost & Found System", SwingConstants.CENTER);
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        frame.add(footerLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewItems();
    }
}