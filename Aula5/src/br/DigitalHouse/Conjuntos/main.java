package br.DigitalHouse.Conjuntos;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Erika");
        conjunto.add("Tchuchao");
        conjunto.add("DuzaoDoBaile");
        conjunto.add("LukinhaRamela");


        for(String valor:conjunto ){
         System.out.println(valor);
        }

        Map<Integer,String > mapa = new HashMap<>();

        mapa.put(1,"CHamaaaaaaa");
        mapa.put(2,"Seguindo pela estrada vou bem sozinho");
        mapa.put(3,"eu vou, eu vou, pela casa agora eu vou");
        mapa.put(5,"eu vou, eu vou, pela casa agora eu vou");

        mapa.remove(1);

        for (Integer chave: mapa.keySet()) {
            String valor = mapa.get(chave);
            System.out.println(valor);
        }

        List<String> lista = new ArrayList<>();

        lista.add("Creuso");
        lista.add("Clementina");
        lista.add("Erika");

        for(String valor:lista){
            System.out.println(valor);
        }

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(12);
        numeros.add(18);
        numeros.add(14);
        numeros.add(10);

        for (Integer listaNumeros: numeros){
            System.out.println(listaNumeros);
        }



        }

}
