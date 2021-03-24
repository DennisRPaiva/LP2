package figures;

import java.awt.*;

public class Rect {
    int x, y;
    int width, height;

    public Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.width, this.height, this.x, this.y);
    }

    public void paint (Graphics gra, int r1,int g1, int b1,int r2,int g2, int b2) {
        Graphics2D g2d = (Graphics2D) gra;
        g2d.setColor(new Color(r1,g1,b1));
        g2d.drawRect(this.x,this.y, this.width,this.height);
        g2d.setColor(new Color(r2,g2,b2));
        g2d.fillRect(this.x,this.y, this.width,this.height);
    }
}