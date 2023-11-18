import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

 class DisplayDotsExample extends JFrame {
    private static final int NUM_DOTS = 100;

    public DisplayDotsExample() {
        setTitle("Display Dots Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for (int i = 0; i < NUM_DOTS; i++) {
                    int x = (int) (Math.random() * getWidth());
                    int y = (int) (Math.random() * getHeight());

                    g.setColor(Color.BLACK);
                    g.fillOval(x, y, 5, 5);
                }
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayDotsExample();
    }
}
