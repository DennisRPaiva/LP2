import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

//Mudei a cor, as formas (retangulos) e o tamanho da janela

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(600, 600);
    }

    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.orange);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,0, w,h);
        g2d.drawLine(0,h, w,0);
        g2d.fillRect(285,285, 30,30);
        g2d.drawRect(270,270, 60,60);
        g2d.drawRect(255,255, 90,90);
        g2d.drawRect(240,240, 120,120);
        g2d.drawRect(225,225, 150,150);
        g2d.drawRect(210,210, 180,180);
        g2d.drawRect(195,195, 210,210);
        
    }
}