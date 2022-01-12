#include <stdio.h>
#include "prg02b.h"

double lA, lB;

int main(void)
{
    printf("Tamanho do lado A: ");
    scanf(" %lf", &lA);
    printf("Tamanho do lado B: ");
    scanf(" %lf", &lB);
    imp_area();
    imp_perimetro();
    return 0;
}

