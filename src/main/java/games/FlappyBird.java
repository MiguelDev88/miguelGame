package games;
import javax.swing.*;
import java.awt.*;

public  class FlappyBird extends Canvas implements Runnable {

    private static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    private static final String title="Flappy Miguel";
    private Thread thread;

    public FlappyBird(){
        JFrame frame= new JFrame(title);

        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);
        this.start();
    }

    private synchronized void start(){
        thread = new Thread(this);
        thread.start();
    }

    private synchronized void stop(){
        try{
            thread.join();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void run(){


    }
}
