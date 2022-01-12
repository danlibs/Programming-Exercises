#include <stdio.h>

int main(void)
{
    int vet[5];
    int vet_copia[5];
    for (int i = 0; i < 5; i++)
    {
        printf("Insira o %iº número: ", i + 1);
        scanf(" %i", &vet[i]);
        vet_copia[i] = vet[i] % 2 == 0 ? vet[i] +1 : vet[i] - 1; 
    }
    printf("Valores nos vetores: \n");
    for (int i = 0; i < 5; i++)
    {
        printf("%i ", vet[i]);
    }
    printf("\nVetor 2: \n");
    for (int i = 0; i < 5; i++)
    {
        printf("%i ", vet_copia[i]);
    }
}