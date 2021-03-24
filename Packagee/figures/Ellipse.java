package figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Ellipse {
    int x, y;
    int w, h;

    public Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics gra, int r1,int g1, int b1,int r2,int g2, int b2) {
        Graphics2D g2d = (Graphics2D) gra;
        g2d.setColor(new Color(r1,g1,b1));
        g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g2d.setColor(new Color(r2,g2,b2));
        g2d.fillOval(this.x, this.y, this.w, this.h);
        //g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
    }
}