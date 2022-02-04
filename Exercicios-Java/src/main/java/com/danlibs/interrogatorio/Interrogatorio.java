package com.danlibs.interrogatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Interrogatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Boolean> respostas = new ArrayList<>();

        System.out.println("Vamos ver se você é inocente, suspeito ou culpado!");
        System.out.print("Você telefonou para a vítima? [s/n] ");
        String resposta = scan.nextLine();
        responder(respostas,resposta);
        System.out.print("Esteve no local do crime? [s/n] ");
        resposta = scan.nextLine();
        responder(respostas,resposta);
        System.out.print("Mora perto da vítima? [s/n] ");
        resposta = scan.nextLine();
        responder(respostas,resposta);
        System.out.print("Devia algo para a vítima? [s/n] ");
        resposta = scan.nextLine();
        responder(respostas,resposta);
        System.out.print("Já trabalhou com a vítima? [s/n] ");
        resposta = scan.nextLine();
        responder(respostas,resposta);

        System.out.println("Você é " + verificarCulpa(respostas) + "!");

    }

    private static void responder(List<Boolean> lista, String resposta) {
        if (resposta.equalsIgnoreCase("s")) {
            lista.add(true);
        } else if (resposta.equalsIgnoreCase("n")) {
            lista.add(false);
        }
    }

    private static String verificarCulpa(List<Boolean> respostas) {
        if (Collections.frequency(respostas, true) == 2) return "suspeito";
        if (Collections.frequency(respostas, true) > 2 && Collections.frequency(respostas, true) <= 4) return "cúmplice";
        if (Collections.frequency(respostas, true) == 5) return "culpado";
        return "inocente";
    }
}


