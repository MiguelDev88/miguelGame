package mainmenu;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Bird extends JComponent {

    Image img= new ImageIcon(getClass().getClassLoader().getResource("images/games/flappy/birdy.png")).getImage();
    Game parent;

    public Bird(int width,int height, Game parent){
        this.parent=parent;
        setSize(new Dimension(width,height));
        setPreferredSize(new Dimension(width,height));
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0,getWidth(), getHeight(), null);
    }

}
