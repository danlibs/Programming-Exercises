package com.danlibs.tabuleiroSecreto;

import java.util.*;

public class TabuleiroSecreto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, numeroOperacoes, operacao, selecao, valor;
        Integer numeroMaisFrequenteLinha = 0, numeroMaisFrequenteColuna = 0;
        N = scan.nextInt();
        int[][] tabuleiro = new int[N][N];
        numeroOperacoes = scan.nextInt();
        Map<Integer, Integer> mapTabuleiro = new HashMap<>();

        for (int w = 0; w < numeroOperacoes; w++) {
            operacao = scan.nextInt();
            selecao = scan.nextInt() - 1;
            switch (operacao) {
                case 1:
                    valor = scan.nextInt();
                    for (int j = 0; j < N; j++) {
                        tabuleiro[selecao][j] = valor;
                    }
                    break;
                case 2:
                    valor = scan.nextInt();
                    for (int i = 0; i < N; i++) {
                        tabuleiro[i][selecao] = valor;
                    }
                    break;
                case 3:
                    mapTabuleiro.clear();

                    for (int i = 0; i < tabuleiro.length; i++) {
                        int tabuleiroLinhaSelecionada = tabuleiro[selecao][i];
                        if (mapTabuleiro.get(tabuleiroLinhaSelecionada) != null) {
                            int contador = mapTabuleiro.get(tabuleiroLinhaSelecionada);
                            contador++;
                            mapTabuleiro.put(tabuleiroLinhaSelecionada, contador);
                        } else {
                            mapTabuleiro.put(tabuleiroLinhaSelecionada, 1);
                        }
                    }

                    Integer maiorQtd = Collections.max(mapTabuleiro.values());
                    List<Integer> numerosQueMaisAparecem = new ArrayList<>();
                    for (Map.Entry<Integer, Integer> entry : mapTabuleiro.entrySet()) {
                        if (entry.getValue().equals(maiorQtd)) {
                            numerosQueMaisAparecem.add(entry.getKey());
                        }
                    }
                    numeroMaisFrequenteLinha = numerosQueMaisAparecem.stream().mapToInt(n -> n).max().getAsInt();
                    System.out.println(numeroMaisFrequenteLinha);
                    break;
                case 4:
                    mapTabuleiro.clear();

                    for (int i = 0; i < tabuleiro.length; i++) {
                        int tabuleiroColunaSelecionada = tabuleiro[i][selecao];
                        if (mapTabuleiro.get(tabuleiroColunaSelecionada) != null) {
                            int contador = mapTabuleiro.get(tabuleiroColunaSelecionada);
                            contador++;
                            mapTabuleiro.put(tabuleiroColunaSelecionada, contador);
                        } else {
                            mapTabuleiro.put(tabuleiroColunaSelecionada, 1);
                        }
                    }

                    maiorQtd = Collections.max(mapTabuleiro.values());
                    numerosQueMaisAparecem = new ArrayList<>();
                    for (Map.Entry<Integer, Integer> entry : mapTabuleiro.entrySet()) {
                        if (entry.getValue().equals(maiorQtd)) {
                            numerosQueMaisAparecem.add(entry.getKey());
                        }
                    }
                    numeroMaisFrequenteColuna = numerosQueMaisAparecem.stream().mapToInt(v -> v).max().getAsInt();
                    System.out.println(numeroMaisFrequenteColuna);
                    break;
            }
        }
    }
}





