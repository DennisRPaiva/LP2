import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PaintApp {
    public static void main (String[] args) {
        PaintFrame frame = new PaintFrame();
        frame.setVisible(true);
    }
}

class PaintFrame extends JFrame {
    Rect r1, r2, r3;  
    Ellipse El1, El2, El3;

    public PaintFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Painting Figures");
        this.setSize(420, 420);
        this.r1 = new Rect(50,50, 200,30);
        this.r2 = new Rect(50,100, 100,30);
        this.r3 = new Rect(50,150, 50,30);

        this.El1 = new Ellipse(50,250, 200,30);
        this.El2 = new Ellipse(50,300, 100,30);
        this.El3 = new Ellipse(50,350, 50,30);
    }

    public void paint (Graphics g) {
        super.paint(g);
        this.r1.paint(g, 0, 0, 255, 102,146,61);
        this.r2.paint(g, 0, 255, 0, 229,101,46);
        this.r3.paint(g, 255, 0, 0, 124,82,29);

        this.El1.paint(g, 0, 0, 255, 102,146,61);
        this.El2.paint(g, 0, 255, 0, 229,101,46);
        this.El3.paint(g, 255, 0, 0, 124,82,29);
        //this.r1.print();
    }
}

class Rect{
    int x, y;
    int w, h;

    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics gra, int r1,int g1, int b1,int r2,int g2, int b2) {
        Graphics2D g2d = (Graphics2D) gra;
        g2d.setColor(new Color(r1,g1,b1));
        g2d.drawRect(
            this.x,this.y,
            this.w,this.h
        );
        g2d.setColor(new Color(r2,g2,b2));
        g2d.fillRect(
            this.x,this.y,
            this.w,this.h
        );
    }
}

class Ellipse{
    int x, y;
    int w, h;

    Ellipse (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    void paint (Graphics gra, int r1,int g1, int b1,int r2,int g2, int b2) {
        Graphics2D g2d = (Graphics2D) gra;
        g2d.setColor(new Color(r1,g1,b1));
        g2d.drawOval(
            this.x,this.y,
            this.w,this.h
        );
        g2d.setColor(new Color(r2,g2,b2));
        g2d.fillOval(
            this.x,this.y,
            this.w,this.h
        );
    }
}