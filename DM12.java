import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 class MessageFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Message Frame Example");

        JButton showMessageButton = new JButton("Show Message");
        showMessageButton.addActionListener(e -> {
            // Display a message in a new frame
            JOptionPane.showMessageDialog(frame, "Hello, this is a message!");
        });

        frame.add(showMessageButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
