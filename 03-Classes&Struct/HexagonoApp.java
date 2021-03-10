import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HexagonoApp {
    public static void main (String[] args){
        Hexa h1 = new Hexa(1, 1, 6, 6, 6, 6, 6, 6, 31.176);
        h1.print();
        System.out.println(h1);
    }
}

class Hexa {
    int posX, posY;
    int lado1,lado2,lado3,lado4,lado5,lado6;
    double area;

    Hexa(int x, int y, int l1,int l2,int l3,int l4,int l5,int l6, double Area) {
        this.posX = x;
        this.posY = y;
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
        this.lado4 = l4;
        this.lado5 = l5;
        this.lado6 = l6;
        this.area = Area;
    }


    void print () {
        System.out.format("O hexagono regular de lado (%d) esta na posicao (%d,%d) tem area igual a (%.2f).\n",
        this.lado1, this.posX, this.posY, this.area);
    }

    @Override
    public String toString(){
        return String.format("O hexagono regular de lado (%d) esta na posicao (%d,%d) tem area igual a (%.2f).\n",
        this.lado1, this.posX, this.posY, this.area);
    }
}