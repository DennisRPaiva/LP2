import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

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
                public void mousePressed(MouseEvent mouse){   
                    start = new Point2D.Double(mouse.getX(), mouse.getY());
                }   
            }
        );

        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent evt) {
                    int x = rand.nextInt(350);
                    int y = rand.nextInt(350);
                    int w = rand.nextInt(50);
                    int h = rand.nextInt(50);
                    if (evt.getKeyChar() == 'r') {
                        Rect r = new Rect(x,y, w,h);
                        figs.add(r);
                        r.print();
                    } 
                    else if (evt.getKeyChar() == 'e') {
                        Ellipse e = new Ellipse(x,y, w,h);
                        figs.add(e);
                        e.print();
                        //figs.add(new Ellipse(x,y, w,h));
                    }
                    else if (evt.getKeyChar() == 't') {
                        Triangulo t = new Triangulo(x,y, w, h);
                        figs.add(t);
                        t.print();
                        //figs.add(new Ellipse(x,y, w,h));
                    }
                    repaint();
                }
            }
        );

        this.setTitle("Lista de Figuras");
        this.setSize(500, 500);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}