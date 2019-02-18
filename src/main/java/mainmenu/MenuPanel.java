package mainmenu;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    Image background= new ImageIcon(getClass().getClassLoader().getResource("images/background.jpg")).getImage();
    public MenuPanel(){
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
    }
}
