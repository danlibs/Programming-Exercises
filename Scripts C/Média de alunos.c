#include <stdio.h>

int main(void) {
    int num_alunos = 0;
    printf("Quer cadastrar a nota de quantos alunos? ");
    scanf("%d", &num_alunos);
    int i = 0;
    while (i < num_alunos)
    {
        printf("Informe as notas do %dº aluno: \n", i + 1);
        float notas[3], soma_notas = 0, media;
        for (int x = 1; x < 4; x++)
        {
            printf("%dª nota: ", x);
            scanf("%f", &notas[x - 1]);
            soma_notas += notas[x - 1];
        }
        media = soma_notas / 3;
        if (media >= 7)
        {
            printf("A média do aluno foi %.1f e ele está APROVADO.\n", media);
        } else
        {
            printf("A média do aluno foi %.1f e ele está REPROVADO.\n", media);
        }
        i++;
    }
    
}
