package com.danlibs.simuladorDados;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class LancamentoDeDados {
    // Faça um programa que simule o lançamento de 1000000 dados e mostre quantas vezes caiu cada lado.
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> dadosLancados = new LinkedHashMap<>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        for (int i = 0; i < 1000000; i++) {
            Integer numeroLancado = random.nextInt(1, 7);
            for (Map.Entry<Integer, Integer> dado : dadosLancados.entrySet()) {
                if (dado.getKey().equals(numeroLancado)) {
                    Integer quantidade = dado.getValue();
                    quantidade++;
                    dadosLancados.put(dado.getKey(), quantidade);
                }
            }
        }

        for (Map.Entry<Integer, Integer> dado : dadosLancados.entrySet()) {
            System.out.println(dado.getKey() + " - " + dado.getValue());
        }
    }


}
