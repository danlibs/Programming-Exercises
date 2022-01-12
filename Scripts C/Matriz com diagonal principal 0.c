#include <stdio.h>

int main(void)
{
    int numeros[4][4];
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            if (i == j)
            {
                numeros[i][j] = 0;
            } else
            {
                printf("Elemento [%i][%i]: ", i, j);
                scanf(" %i", &numeros[i][j]);
            }
        }
    }
    printf("MATRIZ FORMADA: \n");
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("%i ", numeros[i][j]);
        }
        printf("\n");        
    }
}