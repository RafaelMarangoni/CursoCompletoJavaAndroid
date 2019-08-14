package br.DigitalHouse.Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Prova {
    public static void main(String[] args) {
        Set<Integer> saporra = new HashSet<>();

        saporra.add(12);
        saporra.add(1);
        saporra.add(33);
        saporra.add(44);
        saporra.add(32);
        saporra.add(14);
        saporra.add(66);
        saporra.add(23);
        saporra.add(29);

        Prova prova = new Prova();
        System.out.println(prova.somaTotal(saporra));


    }

    public Integer somaTotal(Set<Integer>conjuntoDeInteiros){
        Integer x = 0;
        for (Integer resultado : conjuntoDeInteiros){
            x = x + resultado;

        }
        return x ;
    }

}
