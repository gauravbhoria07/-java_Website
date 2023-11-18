import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class DifferentFontsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Different Fonts Example");

        String[] fontNames = {"Arial", "Times New Roman", "Courier New"};
        JComboBox<String> fontComboBox = new JComboBox<>(fontNames);

        JLabel label = new JLabel("Hello, World!");
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        fontComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFont = (String) fontComboBox.getSelectedItem();
                label.setFont(new Font(selectedFont, Font.PLAIN, 20));
            }
        });

        frame.add(fontComboBox);
        frame.add(label);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
