import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RetanguloAreaDrag {
    public static void main (String[] args){
        Retangulo r1 = new Retangulo(1, 1, 5, 5);
        r1.print();
        //System.out.println(r1);
        
        
    }
}

class Retangulo {
    int posX, posY;
    int lado1,lado2;

    Retangulo(int x, int y, int l1,int l2) {
        this.posX = x;
        this.posY = y;
        this.lado1 = l1;
        this.lado2 = l2;
    }

    int Area(){
        int area = this.lado1 * this.lado2;
        return area;
    }

    void drag(int posX, int posY){
        this.posX += posX;
        this.posY += posY;
    }


    void print () {
        System.out.format("O retangulo de lados (%d) e (%d) esta na posicao (%d,%d).\n",
        this.lado1, this.lado2, this.posX, this.posY);

        System.out.format("A area do retangulo e: ");
        System.out.println(Area());

        System.out.format("O retangulo estava na posicao (%d,%d), e foi para a posicao.",
        this.posX, this.posY);
        drag(posX, posY);
        System.out.format(" %d,%d", this.posX,this.posY);
    }

    @Override
    public String toString(){
        return String.format("O hexagono regular de lados (%d) e (%d) esta na posicao (%d,%d).\n",
        this.lado1, this.lado2, this.posX, this.posY);
    }
}