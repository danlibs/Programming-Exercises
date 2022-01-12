#include <stdio.h>

int main(void)
{
    int numeros[3][4], qtd_pares = 0, qtd_impares = 0;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("Informe o número na posição [%i][%i]: ", i, j);
            scanf(" %i", &numeros[i][j]);
            if (numeros[i][j] % 2 == 0)
            {
                qtd_pares++;
            } else
            {
                qtd_impares++;
            } 
        }
    }
    printf("Quantidade de pares: %i\n", qtd_pares);
    printf("Quantidade de ímpares: %i", qtd_impares);
    
}