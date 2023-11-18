import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

 class MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Example");

        JLabel label = new JLabel("Move the mouse over this label.");

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle mouse clicked event
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Handle mouse pressed event
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Handle mouse released event
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered event
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited event
            }
        });

        frame.add(label);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
