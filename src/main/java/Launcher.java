import mainmenu.MainMenu;
public class Launcher {

    private static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
    public static void main (String[] args){
        MainMenu menu=new MainMenu();
        menu.setVisible(true);
    }
}
