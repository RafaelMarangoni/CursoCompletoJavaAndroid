package br.DigitalHouse.Interfaces;

public class Principal {

    public static void main(String[] args) {

        Cachorro novoCachorro = new Cachorro ("pit-bull");
        novoCachorro.animalSaudavel("safe");
        novoCachorro.setIdade(10);
        int idadeAnimal = novoCachorro.calculoIdadeAnimal(90);
        System.out.println("A idade total é:"+ idadeAnimal);

    }
}
