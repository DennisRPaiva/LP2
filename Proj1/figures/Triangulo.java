package figures;

import java.awt.*;

public class Triangulo extends Figure {
    

    public Triangulo (int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    public void print () {
        System.out.format("Triangulo: w/h (%d,%d) e x/y (%d,%d).\n",
            this.width, this.height, this.x, this.y);
    }

    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawPolygon(new int[]{this.x,this.width,(this.x + 50)},new int[]{this.height,this.width,this.x}, 3);
    }
}
