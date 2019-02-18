package mainmenu;
import javax.swing.*;
import java.awt.*;

public class Background extends JPanel {

    Image img= new ImageIcon(getClass().getClassLoader().getResource("images/background.jpg")).getImage();

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
