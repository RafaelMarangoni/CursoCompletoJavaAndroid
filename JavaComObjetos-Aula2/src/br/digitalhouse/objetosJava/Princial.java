package br.digitalhouse.objetosJava;


public class Princial {
    public static void main(String[] args) {

        Animal animalMamifero = new Animal("Bidu");
        animalMamifero.setNomeAnimal("Lulu");

        System.out.println(animalMamifero.getNomeAnimal());

        Animal animalDomestico = new Animal();
        animalDomestico.setNomeAnimal("zicao");
        System.out.println(animalDomestico.getNomeAnimal());


        Pessoa pessoaJovem = new Pessoa ("Erika");
        System.out.println(pessoaJovem.getNomePessoa());

        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("clotilde");

        animalDomestico.setDonoAnimal(pessoaIdosa);


    }
}
