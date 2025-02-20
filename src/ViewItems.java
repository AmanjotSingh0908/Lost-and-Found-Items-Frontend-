import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewItems {
    public ViewItems() {
        JFrame frame = new JFrame("Lost & Found Items");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Column names
        String[] columns = {"Item Name", "Description", "Status"};

        // Sample data
        String[][] data = {
                {"Laptop", "Black Dell Laptop", "Lost"},
                {"Wallet", "Brown Leather Wallet", "Found"}
        };

        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);



        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new ViewItems();
    }
}
