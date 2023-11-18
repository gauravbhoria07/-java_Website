import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

 class ListBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Box Example");

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");

        JList<String> listBox = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listBox);

        JButton showSelectedButton = new JButton("Show Selected Items");
        showSelectedButton.addActionListener(e -> {
            // Get selected items and perform action
            String selectedItems = String.join(", ", listBox.getSelectedValuesList());
            System.out.println("Selected Items: " + selectedItems);
        });

        frame.add(scrollPane);
        frame.add(showSelectedButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
