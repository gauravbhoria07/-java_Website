import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class ChangeAppletColorExample extends JApplet {
    public void init() {
        JButton changeColorButton = new JButton("Change Background Color");
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });

        add(changeColorButton);
    }
}
