import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class ChangeBackgroundColorExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Background Color Example");

        JButton changeColorButton = new JButton("Change Background Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.CYAN);
            }
        });

        frame.add(changeColorButton);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
