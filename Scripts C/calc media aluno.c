#include <stdio.h>

int main() {
    float av1, av2, media;

    printf("Informe o valor da AV1: ");
    scanf("%f", &av1);
    printf("Informe o valor da AV2: ");
    scanf("%f", &av2);
    media = (av1 + av2)/2;

    if(media >= 7) {
        printf("Parabéns, você foi aprovado! Sua média foi %.1f.", media);
    } else {
        printf("Infelizmente você não foi aprovado. Sua média foi %.1f.", media);
    }

}