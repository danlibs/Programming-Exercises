#include <stdio.h>
#include "prg02b.h"

extern double lA, lB;

void imp_area(void)
{
    printf("Área = %lf\n", lA * lB);
}

void imp_perimetro(void)
{
    printf("Perímetro = %lf\n", lA * 2 + lB * 2);
}