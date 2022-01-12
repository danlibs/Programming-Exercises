#include <stdio.h>
#include "prg01a.h"
#include "prg01b.h"

double a, b;

int main(void) 
{
    printf("Digite o primeiro número: ");
    scanf(" %lf", &a);
    printf("Digite o segundo número: ");
    scanf(" %lf", &b);
    imp_media();
    imp_maior();
    return 0;
}