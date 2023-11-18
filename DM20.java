import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

 class EmailTextFieldValidationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Email TextField Validation Example");

        JTextField emailTextField = new JTextField();

        emailTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '@' || c == '.')) {
                    e.consume(); // Ignore non-email characters
                }
            }
        });

        frame.add(emailTextField);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
