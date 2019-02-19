package mainmenu;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class FlappyButton extends JComponent implements MouseListener {

    Image img= new ImageIcon(getClass().getClassLoader().getResource("images/games/flappy/flappybtn.png")).getImage();
    MainMenu parent;

    public FlappyButton(int width,int height, MainMenu parent){
        this.parent=parent;
        addMouseListener(this);
        setSize(new Dimension(width,height));
        setPreferredSize(new Dimension(width,height));
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0,getWidth(), getHeight(), null);
    }

    public void mouseClicked(MouseEvent e) {
        parent.startGame();
    }

    public void mousePressed(MouseEvent e) {
        this.img=new ImageIcon(getClass().getClassLoader().getResource("images/games/flappy/flappybtnclick.png")).getImage();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        this.img=new ImageIcon(getClass().getClassLoader().getResource("images/games/flappy/flappybtn.png")).getImage();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        this.img=new ImageIcon(getClass().getClassLoader().getResource("images/games/flappy/flappybtn.png")).getImage();
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        this.img=new ImageIcon(getClass().getClassLoader().getResource("images/games/flappy/flappybtn.png")).getImage();
        repaint();
    }
}
