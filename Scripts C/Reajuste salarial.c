#include <stdio.h>

int main() {
    float porc, salario, maior_salario = 0, reajuste;

    printf("Informe a porcentagem do ajuste salarial: ");
    scanf("%f", &porc);
    for (int i = 0; i < 5; i++)
    {
        printf("Informe o valor do salário do %dº funcionário: ", i);
        scanf("%f", &salario);
        reajuste = salario + (salario * (porc/100));
        if (reajuste > maior_salario)
        {
            maior_salario = reajuste;
        }
    }
    printf("Após o reajuste, o maior salário da empresa é R$%.2f.", maior_salario);
}