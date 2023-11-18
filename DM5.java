import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

 class KeyboardEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Keyboard Event Example");

        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Handle key typed event
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Handle key pressed event
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Handle key released event
            }
        });

        frame.add(textField);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
