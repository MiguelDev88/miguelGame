package mainmenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    private static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private ArrayList<Rectangle> columns;
    private Random rand= new Random();
    private int ticks, gravity;
    Image background= new ImageIcon(getClass().getClassLoader().getResource("images/background.jpg")).getImage();


    public GamePanel(){
        super();
        Timer timer = new Timer(20,this);
        columns= new ArrayList<Rectangle>();

        addColumn();
        addColumn();
        addColumn();
        addColumn();

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
        //g.setColor(Color.cyan);
        //g.fillRect(0,0,WIDTH,HEIGHT);
        for(Rectangle column:columns)
            paintColumn(g,column);
    }

    public void addColumn(){
        int space=150;
        int width=60;
        int height=50 + rand.nextInt(300);


        columns.add(new Rectangle(WIDTH+width+columns.size()*150,HEIGHT-height,width,height));
        columns.add(new Rectangle(WIDTH+width+(columns.size()-1)*150,0, width,HEIGHT-height-space));
    }

    public void paintColumn(Graphics g, Rectangle column){
        g.setColor(Color.green.darker());
        g.fillRect(column.x,column.y,column.width,column.height);
    }

    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<columns.size();i++){
            columns.get(i).x=columns.get(i).x-1;
        }


        repaint();
    }
}