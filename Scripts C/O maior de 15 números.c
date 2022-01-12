#include <stdio.h>

int main(void) {
    int num;
    int maior = 0;
    int i = 1;
    while (i < 16)
    {
        printf("Digite o %dº número: ", i);
        scanf("%d", &num);
        maior = (num > maior ? num : maior);
        i++;
    }
    printf("O maior número digitado foi %d.", maior);

}