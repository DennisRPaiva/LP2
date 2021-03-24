package Packagee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import figures.Ellipse;
import figures.Rect;

class PackApp {
    public static void main (String[] args) {
        PackFrame frame = new PackFrame();
        frame.setVisible(true);
    }
}

class PackFrame extends JFrame {
    Rect r1, r2, r3;
    Ellipse e1, e2, e3;

    PackFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java Packages");
        this.setSize(420, 420);
        //this.r1 = new Rect(50,50, 100,30);
        this.r1 = new Rect(50,50, 200,30);
        this.r2 = new Rect(50,100, 100,30);
        this.r3 = new Rect(50,150, 50,30);

        //this.e1 = new Ellipse(50,100, 100,30);
        this.e1 = new Ellipse(50,250, 200,30);
        this.e2 = new Ellipse(50,300, 100,30);
        this.e3 = new Ellipse(50,350, 50,30);
    }

    public void paint (Graphics g) {
        super.paint(g);
        //this.r1.paint(g);
        this.r1.paint(g, 0, 0, 255, 102,146,61);
        this.r2.paint(g, 0, 255, 0, 229,101,46);
        this.r3.paint(g, 255, 0, 0, 124,82,29);

        //this.e1.paint(g);
        this.e1.paint(g, 0, 0, 255, 102,146,61);
        this.e2.paint(g, 0, 255, 0, 229,101,46);
        this.e3.paint(g, 255, 0, 0, 124,82,29);
    }
}