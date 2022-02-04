package com.danlibs.estadosEpopulacaoNordeste;

import java.util.*;

public class NordestePopulacao {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados do nordeste e suas populações: ");
        Map<String, Integer> nordeste = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(nordeste);

        nordeste.put("RN", 3534165);
        System.out.println("Substitua a população do RN por 3534165: " + nordeste);

        System.out.println("Confira se o estado PB está no dicionário. Se não, adicione-o: ");
        if (!nordeste.containsKey("PB")) nordeste.put("PB", 4039277);
        System.out.println(nordeste);

        System.out.println("Exiba a população de PE: " + nordeste.get("PE"));

        System.out.println("Exiba os estados e populações na ordem em que foram informados: ");
        Map<String, Integer> nordesteLinkedHashMap = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> estado : nordesteLinkedHashMap.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("Exiba os estados e populações em ordem alfabética: ");
        Map<String, Integer> nordesteTreeMap = new TreeMap<>(nordesteLinkedHashMap);
        for (Map.Entry<String, Integer> estado : nordesteTreeMap.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        Integer menorPopulacao = Collections.min(nordeste.values());
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> estado : nordeste.entrySet()) {
            if (estado.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = estado.getKey();
                System.out.println("Estado com a menor população: " + estado.getKey() + " - " + estado.getValue());
            }
        }

        Integer maiorPopulacao = Collections.max(nordeste.values());
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> estado : nordeste.entrySet()) {
            if (estado.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = estado.getKey();
                System.out.println("Estado com a maior população: " + estado.getKey() + " - " + estado.getValue());
            }
        }

        Integer soma = 0;
        for (Integer integer : nordeste.values()) soma += integer;
        System.out.println("Soma das populações: " + soma);

        System.out.println("Média das populações: " + soma / nordeste.size());

        nordeste.values().removeIf(estado -> estado < 4000000);
        System.out.println("Remova os estados com menos de 4000000 de habitantes: ");
        System.out.println(nordeste);

        nordeste.clear();
        System.out.println("Apague o dicionário: " + nordeste);

        System.out.println("Confira se o dicionário está vazio: " + nordeste.isEmpty());


    }
}
