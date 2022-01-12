#include <stdio.h>

extern double a, b;

void imp_maior(void)
{
    if (a > b)
        printf("%lf é maior que %lf\n", a, b);
    else
        printf("%lf é maior que %lf\n", b, a);
}