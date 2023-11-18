import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

 class ButtonWithBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button with Border Example");

        JButton button = new JButton("Click Me");
        button.setBorder(new BevelBorder(BevelBorder.RAISED));

        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
