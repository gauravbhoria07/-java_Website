import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Box Example");

        JCheckBox checkBox = new JCheckBox("Enable Feature");

        // You can use checkBox.isSelected() to get the state
        // checkBox.setSelected(true) to set the state

        frame.add(checkBox);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
