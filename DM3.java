import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class ButtonWithImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button with Image");

        JButton button = new JButton("Click Me");
        JLabel label = new JLabel();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to display an image when the button is clicked
                // You can use ImageIcon and setIcon() method
            }
        });

        frame.add(button);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
