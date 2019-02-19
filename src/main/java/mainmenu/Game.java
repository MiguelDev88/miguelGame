package mainmenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    private static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private GamePanel gamepanel;



    public Game(){
        JFrame frame=new JFrame("Game");
        //set dimensions
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));

        //set configuration
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        //frame.setLocationRelativeTo(null);
        frame.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("images/logoIcon.png")).getImage());

        gamepanel=new GamePanel();
        frame.setContentPane(gamepanel);
        frame.setVisible(true);
    }

}
