#include <stdio.h>
int main() {
    int maior_numero = 0, numero;
    
    for(int i = 0; i < 5; i++) {
        printf("Número: ");
        scanf("%d", &numero);

        if (numero > maior_numero) {
            maior_numero = numero;
        }
    }
    printf("O maior número digitado foi %d.", maior_numero);
    return 0;
}


