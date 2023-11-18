import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JButton showLabelButton = new JButton("Show Selected Label");
        JLabel resultLabel = new JLabel();

        showLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    resultLabel.setText("Selected: Option 1");
                } else if (radioButton2.isSelected()) {
                    resultLabel.setText("Selected: Option 2");
                } else {
                    resultLabel.setText("No option selected");
                }
            }
        });

        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(showLabelButton);
        frame.add(resultLabel);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
