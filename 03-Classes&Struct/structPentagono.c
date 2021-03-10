#include <stdio.h>


typedef struct {
    int posX, posY;
    int lado1,lado2,lado3,lado4,lado5;
    float area;
} Pent;

void print (Pent* p) {
    printf("O pentagono regular de lado (%d) esta na posicao (%d,%d) tem area igual a (%.2f).\n",
    p->lado1, p->posX, p->posY, p->area);
}


void main () {
    Pent P1 = {1,1 ,4,4,4,4,4  ,27.5};
    print (&P1);
}