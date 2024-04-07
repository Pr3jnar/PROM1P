import javax.swing.*;
import java.awt.*;


public class MujPanel extends JPanel {


    private  MujObrazek obrazek;

    public MujPanel(MujObrazek obrazek){
        this.obrazek = obrazek;
    }

    public void paintComponent( Graphics g){
        super.paintComponent(g);
        Graphics2D graphics2D=(Graphics2D) g;
        for (MujTvar tvar:obrazek.getTvars()
             ) {
            tvar.Draw(graphics2D);
        }





    }
}
