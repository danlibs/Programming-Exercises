#include <stdio.h>

int main(void) {
    int qtd_vogais[5] = {0, 0, 0, 0, 0};
    char letra;
    while (letra != 'z')
    {
        printf("Digite uma letra: ");
        scanf(" %c", &letra);    
        switch (letra)
        {
        case 'a':
            qtd_vogais[0]++;
            break;
        case 'e':
            qtd_vogais[1]++;
            break;
        case 'i':
            qtd_vogais[2]++;
            break;
        case 'o':
            qtd_vogais[3]++;
            break;
        case 'u':
            qtd_vogais[4]++;
            break;
        default:
            break;
        }
    }
    printf("Quantidades de letras 'a': %i\n", qtd_vogais[0]);
    printf("Quantidades de letras 'e': %i\n", qtd_vogais[1]);
    printf("Quantidades de letras 'i': %i\n", qtd_vogais[2]);
    printf("Quantidades de letras 'o': %i\n", qtd_vogais[3]);
    printf("Quantidades de letras 'u': %i\n", qtd_vogais[4]);
}