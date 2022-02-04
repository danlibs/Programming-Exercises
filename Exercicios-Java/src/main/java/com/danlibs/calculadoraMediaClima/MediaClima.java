package com.danlibs.calculadoraMediaClima;

import java.util.ArrayList;
import java.util.List;

public class MediaClima {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(27.5);
        temperaturas.add(30.6);
        temperaturas.add(25d);
        temperaturas.add(26.7);
        temperaturas.add(31.6);
        temperaturas.add(29.7);

        Double somaTemperaturas = 0d;
        for (Double temperatura : temperaturas) {
            somaTemperaturas += temperatura;
        }
        Double media = somaTemperaturas / temperaturas.size();

        System.out.printf("Média semestral das temperaturas: %.1f\n", media);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        List<String> tempAcimaMedia = new ArrayList<>();
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                tempAcimaMedia.add(meses[i]);
            }
        }

        System.out.println("Mês(es) com temperatura acima da média: ");
        for (String mes : tempAcimaMedia) {
            System.out.println("- " + mes);
        }

    }
}
