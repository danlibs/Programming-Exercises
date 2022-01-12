#include <stdio.h>

int main(void)
{
    const int QTD_ALUNOS = 3;
    float nota1[QTD_ALUNOS], nota2[QTD_ALUNOS], nota3[QTD_ALUNOS], media_aluno[QTD_ALUNOS], media_turma;
    for (int i = 0; i < QTD_ALUNOS; i++)
    {
        printf("----- ALUNO %i -----\n", i + 1);
        printf("1ª avaliação: ", i + 1);
        scanf(" %f", &nota1[i]);
        printf("2ª avaliação: ", i + 1);
        scanf(" %f", &nota2[i]);
        printf("3ª avaliação: ", i + 1);
        scanf(" %f", &nota3[i]);
    }
    int soma_notas1, soma_notas2, soma_notas3;
    for (int j = 0; j < QTD_ALUNOS; j++)
    {
        soma_notas1 += nota1[j];
        soma_notas2 += nota2[j];
        soma_notas3 += nota3[j];
        media_aluno[j] = (nota1[j] + nota2[j] + nota3[j]) / 3;
    }
    printf("############ MÉDIA DE CADA PROVA ############\n");
    printf("Média das notas da 1ª avaliação: %.1f\n", soma_notas1 / (float) QTD_ALUNOS);
    printf("Média das notas da 2ª avaliação: %.1f\n", soma_notas2 / (float) QTD_ALUNOS);
    printf("Média das notas da 3ª avaliação: %.1f\n\n", soma_notas3 / (float) QTD_ALUNOS);
    printf("############ MÉDIAS INDIVIDUAIS ############\n");
    for (int w = 0; w < QTD_ALUNOS; w++)
    {
        printf("ALUNO %i: %.1f\n", w + 1, media_aluno[w]);
    }
    printf("\n############ MÉDIA GERAL DA TURMA ############\n");
    float soma_medias;
    for (int z = 0; z < QTD_ALUNOS; z++)
    {
        soma_medias += media_aluno[z]; 
    }
    media_turma = soma_medias / QTD_ALUNOS;
    printf("Média da turma: %.1f", media_turma);
    
}