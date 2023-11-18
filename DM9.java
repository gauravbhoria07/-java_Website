import javax.swing.JButton;
import javax.swing.JFrame;

 class SwitchFramesExample {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Frame 1");
        JFrame frame2 = new JFrame("Frame 2");

        JButton switchButton = new JButton("Switch Frames");

        switchButton.addActionListener(e -> {
            frame1.setVisible(!frame1.isVisible());
            frame2.setVisible(!frame2.isVisible());
        });

        frame1.add(switchButton);
        frame1.setSize(300, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setVisible(true);

        frame2.setSize(300, 200);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setVisible(false);
    }
}
