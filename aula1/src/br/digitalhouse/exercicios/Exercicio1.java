package br.digitalhouse.exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello Word" + " " + 3433);

        int numeroInteiro = 0;
        int umNumeroA = 13;
        int umNumero;
        double umNumeroB = 15;

        String umaCadeiaDeTexto = "UTCHSAAAA";

        //double resultado = umNumeroA + umNumeroB;

        //double subtracao = umNumeroA - umNumeroB;

        //  System.out.println(subtracao);

        // if (umNumeroB <= umNumeroA) {
        //  System.out.println(true);
        // }else{
        //    System.out.println(false);
        // }
//        if(umNumeroA == Math.floor(umNumeroA) && umNumeroA%2 == 1 && umNumeroA >= 10){
//            System.out.println( umNumeroA + "é um  numero inteiro");
//        }else{
//            System.out.println("deu ruim essa porra");
//        }

//        for (int i = 0; i <= umNumeroA; i++ ){
//            numeroInteiro = numeroInteiro + i;
//            System.out.println(numeroInteiro);
//        }
//
//        int[] array = {1, 2, 4, 5, 6, 7, 8, 10};
//            for (var i = 0; i<=array; i++);

        //EXERCICIO 5
//      List<Integer> numeros = new ArrayList<>();
//
//        numeros.add(2);
//        numeros.add(4);
//        numeros.add(5);
//        numeros.add(6);
//        numeros.add(8);
//        numeros.add(3);
//        numeros.add(10);
//        int soma = 0;
//        for(var i = 0; i<numeros.size(); i++){
//
//            soma = soma + numeros.get(i);
//
//            System.out.println("O resultado de soma é "+ soma);
//        }

        //Exercicio 6

        List<Integer> desgraca = new ArrayList<>();

        desgraca.add(1);
        desgraca.add(4);
        desgraca.add(6);
        desgraca.add(9);
        desgraca.add(90);
        desgraca.add(3);
        desgraca.add(9);
        desgraca.add(7);
        desgraca.add(15);


        List<Integer> pares = new ArrayList<>();

        for (int i = 0; i <desgraca.size(); i++) {
            if(desgraca.get(i) %2 == 0){
                pares.add(desgraca.get(i));
            }

        }
        System.out.println(pares);

//        for(int i = 0; i < desgraca.size() ; i++){
//            if(i%2 == 0){
//                contador = contador + i;
//                System.out.println(contador);
//            };
//        }


        //Exercicio 6

//        for (int i = 0; i < desgraca.size(); i++) {
//            if (i % 2 == 0) {
//                System.out.println(i%2==0);
//            }
//            ;
//        }


    }
}





