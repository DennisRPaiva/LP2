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
    ArrayList<Figure> figsRect = new ArrayList<Figure>();
    ArrayList<Figure> figsElls = new ArrayList<Figure>();
    Random rand = new Random();

    ListFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
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
                        figsRect.add(r);
                    } else if (evt.getKeyChar() == 'e') {
                        Ellipse e = new Ellipse(x,y, w,h);
                        figsElls.add(e);
                    }
                    repaint();
                }
            }
        );

        this.setTitle("Lista de Figuras");
        this.setSize(420, 420);
    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure figsRect: this.figsRect) {
            figsRect.paint(g);
        }
        for (Figure figsElls: this.figsElls) {
            figsElls.paint(g);
        }
    }
}
