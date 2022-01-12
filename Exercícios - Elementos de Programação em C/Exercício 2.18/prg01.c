#include <stdio.h>

double a, b;
extern void imp_media(void);
extern void imp_maior(void);

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