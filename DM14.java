import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;

 class AvailableFontsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Available Fonts Example");

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();

        StringBuilder fontList = new StringBuilder("Available Fonts:\n");

        for (String fontName : fontNames) {
            fontList.append(fontName).append("\n");
        }

        JLabel label = new JLabel(fontList.toString());
        frame.add(label);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
