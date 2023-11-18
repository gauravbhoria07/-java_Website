import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

class CheckBoxRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Boxes and Radio Buttons Example");

        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");

        JRadioButton radioButton1 = new JRadioButton("Choice 1");
        JRadioButton radioButton2 = new JRadioButton("Choice 2");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
