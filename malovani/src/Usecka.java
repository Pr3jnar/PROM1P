import java.awt.*;

public class Usecka implements MujTvar{
    private int vyska;
    private int sirka;
    private int poziceX;
    private int poziceY;
    private int tlouska;
    private Color barva;

    public Usecka(int vyska, int sirka, int poziceX, int poziceY, int tlouska, Color barva) {
        this.vyska = vyska;
        this.sirka = sirka;
        this.poziceX = poziceX;
        this.poziceY = poziceY;
        this.tlouska = tlouska;
        this.barva = barva;
    }

    @Override
    public void Draw(Graphics2D g) {
        g.setColor(barva);
        g.setStroke(new BasicStroke(tlouska));
        g.drawLine(poziceX,poziceY,tlouska,vyska);
    }
}
