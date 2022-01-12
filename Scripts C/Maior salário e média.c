#include <stdio.h>

int main() {
    float salario, maior_salario = 0, media, soma;

    for (int i = 0; i < 10; i++)
    {
        printf("Informe o salário do %dº funcionário: ", i+1);
        scanf("%f", &salario);
        if (salario > maior_salario) 
        {
            maior_salario = salario;
        }
        soma += salario;
    }
    media = soma/10;
    printf("A média salarial da empresa é R$%.2f, sendo o maior salário R$%.2f.", media, maior_salario);
    return 0;
}