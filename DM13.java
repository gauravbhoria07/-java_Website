import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

 class CloseFrameWithWindowAdapter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Close Frame Example");

        JButton closeButton = new JButton("Close Frame");
        closeButton.addActionListener(e -> frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING)));

        frame.add(closeButton);
        frame.setSize(300, 200);

        // Close the frame using WindowAdapter
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
