#include <stdio.h>

int main() {
    int qtd_numeros, numero, soma_pares = 0, soma_impares = 0;
    printf("Informe quantos números deseja dizer: ");
    scanf("%d", &qtd_numeros);
    for (int i = 0; i < qtd_numeros; i++)
    {
        printf("Informe o %dº número: ", i + 1);
        scanf("%d", &numero);
        if (numero % 2 == 0)
        {
            soma_pares += numero;
        } else
        {
            soma_impares += numero;
        }
    }
    printf("SOMA DOS PARES: %d\n", soma_pares);
    printf("SOMA DOS ÍMPARES: %d\n", soma_impares);
    
}