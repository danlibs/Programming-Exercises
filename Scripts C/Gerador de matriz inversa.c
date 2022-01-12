#include <stdio.h>

int main(void)
{
    int matriz[4][4];
    int matriz_inversa[4][4];
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("Elemento [%i][%i]: ", i, j);
            scanf(" %i", &matriz[i][j]);
            matriz_inversa[j][i] = matriz[i][j];
        } 
    }
    printf("######### MATRIZ FORMADA #########\n");
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("%i ", matriz[i][j]);
        }
        printf("\n");  
    }
    printf("######### MATRIZ INVERSA #########\n");
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("%i ", matriz_inversa[i][j]);
        }
        printf("\n");   
    }
    
}