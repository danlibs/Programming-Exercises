package com.danlibs.linguagemFavorita;

import java.util.Comparator;

public class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        if (l1.getNome() != l2.getNome())
            return l1.getNome().compareToIgnoreCase(l2.getNome());

        if (l1.getAnoCriacao() != l2.getAnoCriacao())
            return Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
