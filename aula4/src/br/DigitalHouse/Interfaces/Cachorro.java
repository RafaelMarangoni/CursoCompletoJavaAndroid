package br.DigitalHouse.Interfaces;

public class Cachorro extends Animal implements Saudavel{


    public Cachorro (String raca){
        super(raca);

    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
       if (diagnostico != null &&  diagnostico != " "){
           System.out.println("O animal"+" "+ getRaca()+" " +"está com o seguinte diagnostico:" + diagnostico );
       }else{
           System.out.println("Não possui diagnostico");
       }

        return false;
    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("estamos somando as idades");
        return getIdade() + novaIdade;
    }

    @Override
    public void seDivertir() {

    }
}
