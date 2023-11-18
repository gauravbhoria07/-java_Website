import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

 class TextAreaPasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area and Password Field");

        JTextArea textArea = new JTextArea();
        JPasswordField passwordField = new JPasswordField();

        frame.add(textArea);
        frame.add(passwordField);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
