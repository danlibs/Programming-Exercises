package com.danlibs.arcoiris;

import java.util.*;

public class Arcoiris {
    public static void main(String[] args) {
        Set<String> arcoiris = new LinkedHashSet<>(Arrays.asList("vermelho", "alaranjado", "amarelo", "verde",
                "azul", "anil", "violeta"));

        System.out.println("1 - Exiba as cores do arco-íris uma abaixo da outra: ");
        for (String cor : arcoiris) {
            System.out.println(cor);
        }

        System.out.println("2 - A quantidade de cores que o arco-íris tem: " + arcoiris.size());

        System.out.println("3 - As cores em ordem alfabética: ");
        Set<String> arcoiris2 = new TreeSet<>(new ComparaOrdem());
        arcoiris2.addAll(arcoiris);
        for (String cor : arcoiris2) {
            System.out.println(cor);
        }

        System.out.println("4 - Exiba as cores na ordem inversa da que foi informada: ");
        List<String> arcoirisLista = new ArrayList<>(Arrays.asList("vermelho", "alaranjado", "amarelo", "verde",
                "azul", "anil", "violeta"));
        Collections.reverse(arcoirisLista);
        System.out.println(arcoirisLista);

        Iterator<String> iterator = arcoiris.iterator();
        List<String> coresV = new ArrayList<>();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.startsWith("v")) coresV.add(next);
        }
        System.out.println("5 - Exiba as cores que começam com 'v': " + coresV);

        arcoiris.removeIf(next -> !next.startsWith("v"));
        System.out.println("6 - Remova todas as cores que não começam com 'v': " + arcoiris);

        arcoiris.clear();
        System.out.println("7 - Limpe o conjunto: " + arcoiris);

        System.out.println("8 - Verifique se o conjunto está vazio: " + arcoiris.isEmpty());

    }
}

