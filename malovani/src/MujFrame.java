import javax.swing.*;
import java.awt.*;

public class MujFrame extends JFrame {
    public MujFrame() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.white);
        setExtendedState(Frame.MAXIMIZED_BOTH);

        MujObrazek obrazek = new MujObrazek();
        obrazek.addTvar(new Obdelnik(100,200,600,900,10,Color.RED));
        obrazek.addTvar(new Elipsa(200,200,100,100,20,Color.GRAY));
        obrazek.addTvar(new Usecka(200,20,500,200,50,Color.CYAN));

        MujPanel panel = new MujPanel(obrazek);
        add(panel);
        setVisible(true);
    }
}
