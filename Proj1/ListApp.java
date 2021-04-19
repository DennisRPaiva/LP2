import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import figures.*;

class ListApp {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();

    Point2D start;

    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addMouseListener(
            new MouseAdapter() {
                public void mousePressed(MouseEvent mouseLocation){   
                    start = new Point2D.Double(mouseLocation.getX(), mouseLocation.getY());
                }   
            }
        );

        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    //int x = rand.nextInt(350);
                    //int y = rand.nextInt(350);
                    int w = rand.nextInt(50);
                    int h = rand.nextInt(50);
                    if (evt.getKeyChar() == 'r') {
                        //Rect r = new Rect(x,y, w,h);
                        int posx = (int) start.getX();
                        int posy = (int) start.getY();
                        Rect r = new Rect(posx, posy, 30, 30);
                        figs.add(r);
                        r.print();
                    } 
                    else if (evt.getKeyChar() == 'e') {
                        int posx = (int) start.getX();
                        int posy = (int) start.getY();
                        Ellipse e = new Ellipse(posx,posy, 35,35);
                        figs.add(e);
                        e.print();
                        //figs.add(new Ellipse(x,y, w,h));
                    }
                    else if (evt.getKeyChar() == 't') {
                        int posx = (int) start.getX();
                        int posy = (int) start.getY();
                        Triangulo t = new Triangulo(posx,posy, 50, 50);
                        figs.add(t);
                        //t.print();
                        //figs.add(new Ellipse(x,y, w,h));
                    }

                    else if (evt.getKeyChar() == 'p') {
                        int posx = (int) start.getX();
                        int posy = (int) start.getY();
                        Pentaguno p = new Pentaguno(posx,posy, 50, 50);
                        figs.add(p);
                        //p.print();
                        //figs.add(new Ellipse(x,y, w,h));
                    }
                    repaint();
                }
            }
        );

        this.setTitle("Lista de Figuras");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}
