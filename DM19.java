import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

 class NumberTextFieldValidationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number TextField Validation Example");

        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignore non-digit characters
                }
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
