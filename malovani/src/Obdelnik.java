import java.awt.*;

public class Obdelnik implements MujTvar{
    private int vyska;
    private int sirka;
    private int poziceX;
    private int poziceY;
    private int tlouska;
    private Color barva;

    public Obdelnik(int vyska, int sirka, int poziceX, int poziceY, int tlouska, Color barva) {
        this.vyska = vyska;
        this.sirka = sirka;
        this.poziceX = poziceX;
        this.poziceY = poziceY;
        this.tlouska = tlouska;
        this.barva = barva;
    }



    /*public Obdelnik() {
        vyska = 100;
        sirka = 100;
        poziceX = 75;
        poziceY = 75;
        barva = Color.blue;
        tlouska = 5;
    }*/


    public void Draw(Graphics2D graphics) {
        graphics.setStroke(new BasicStroke(tlouska));
        graphics.setColor(barva);
        graphics.drawRect(poziceX,poziceY,sirka,vyska);
    }






}
