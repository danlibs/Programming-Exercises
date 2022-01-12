#include <stdio.h>
#include "prg01a.h"

extern double a, b;

void imp_media(void)
{
    printf("Média: %lf\n", (a + b) / 2);
}