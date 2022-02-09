package com.danlibs.calculoCobaias;

import java.util.Scanner;

public class CalculoCobaias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;
        char tipo;
        int C = 0, R = 0, S = 0, totalCobaias;
        double percC, percR, percS;
        int N = input.nextInt();

//Escreva o seu código aqui
        for (int i = 0; i < N; i++) {
            b = input.nextInt();
            tipo = input.next().charAt(0);
            switch (tipo) {
                case 'C' -> C += b;
                case 'R' -> R += b;
                case 'S' -> S += b;
                default -> System.out.println("Opção inválida!");
            }
        }
        totalCobaias = C + S + R;
        percC = (C * 100) / (double) totalCobaias;
        percR = (R * 100) / (double) totalCobaias;
        percS = (S * 100) / (double) totalCobaias;


        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percS);

    }
}

