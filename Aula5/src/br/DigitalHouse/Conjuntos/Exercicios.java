package br.DigitalHouse.Conjuntos;

import java.util.*;

public class Exercicios {
    public static void main(String[] args) {

        Map<Integer, String> loteria = new HashMap<>();

        loteria.put(1, "Ovos");
        loteria.put(2, "Água");
        loteria.put(3, "Cavalo");
        loteria.put(4, "Dentista");
        loteria.put(5, "Fogo");

        for (Integer chave : loteria.keySet()) {
            String valor = loteria.get(chave);
            //System.out.println(valor);
        }

        Map<String, String> apelidos = new HashMap<>();

        apelidos.put("Joao", "Juan,fissura,Maromba");
        apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary,Marilene");
        apelidos.put("Joao", "Lukinha, Jorge, George");

        for (String resultado : apelidos.keySet()) {
            String valor = apelidos.get(resultado);
            // System.out.println(valor);

        }

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(8);
        numeros.add(8);

        for (Integer resultado : numeros) {
            System.out.println(resultado);
        }
        System.out.println("----------------------------------------------------");
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        for (Integer valor : conjunto) {
            System.out.println(valor);
        }



    }
}
