#include <stdio.h>

double lA, lB;

void imp_area(void);
void imp_perimetro(void);

int main(void)
{
    printf("Tamanho do lado A: ");
    scanf(" %lf", &lA);
    printf("Tamanho do lado B: ");
    scanf(" %lf", &lB);
    imp_area();
    imp_perimetro();
}

void imp_area(void)
{
    printf("area = %lf\n", lA * lB);
}

void imp_perimetro(void)
{
    printf("perímetro = %lf", lA * 2 + lB * 2);
}