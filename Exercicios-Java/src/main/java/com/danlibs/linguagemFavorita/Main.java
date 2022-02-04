package com.danlibs.linguagemFavorita;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Kotlin", 2016, "Android Studio"));
        linguagens.add(new LinguagemFavorita("C", 1970, "VS Code"));
        linguagens.add(new LinguagemFavorita("Java", 1992, "IntelliJ IDEA"));
        linguagens.add(new LinguagemFavorita("C#", 2001, "Visual Studio"));
        linguagens.add(new LinguagemFavorita("Python", 1995, "PyCharm"));


        System.out.println("--\tORDEM DE INSERÇÃO\t--");
        exibirLinguagens(linguagens);

        System.out.println("--\tORDEM NATURAL (nome)\t--");
        List<LinguagemFavorita> linguagensList = new ArrayList<>(linguagens);
        Collections.sort(linguagensList);
        exibirLinguagens(linguagensList);

        System.out.println("--\tORDEM IDE\t--");
        Set<LinguagemFavorita> linguagensTree = new TreeSet<>(new ComparatorIde());
        linguagensTree.addAll(linguagens);
        exibirLinguagens(linguagensTree);

        System.out.println("--\tORDEM ANO/NOME\t--");
        Set<LinguagemFavorita> linguagensTree1 = new TreeSet<>(new ComparatorAno());
        linguagensTree1.addAll(linguagens);
        exibirLinguagens(linguagensTree1);

        System.out.println("--\tORDEM NOME/ANO/IDE\t--");
        Set<LinguagemFavorita> linguagensTree2 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagensTree2.addAll(linguagens);
        exibirLinguagens(linguagensTree2);

    }

    static void exibirLinguagens(Set<LinguagemFavorita> linguagens) {
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
    static void exibirLinguagens(List<LinguagemFavorita> linguagens) {
        for (LinguagemFavorita linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
