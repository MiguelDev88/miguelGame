package mainmenu;
import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{

    private static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    public MainMenu(){
        super("Main Menu");
        //set dimensions
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setMaximumSize(new Dimension(WIDTH,HEIGHT));
        setMinimumSize(new Dimension(WIDTH,HEIGHT));

        //set configuration
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("images/logoIcon.png")).getImage());

        //set content
        MenuPanel menu = new MenuPanel();

        menu.add(new FlappyButton(getWidth()/4,getHeight()/8));
        setContentPane(menu);

        pack();
    }
}
