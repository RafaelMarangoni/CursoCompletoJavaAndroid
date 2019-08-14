package br.DigitalHouse.HerançaClasseAbstrata;

public class Principal {
    public static void main(String[] args) {

        Crianca bebe = new Crianca("maria","feminino");
        System.out.println(bebe.getNome()+ "\n" + bebe.getSexo() );

        Crianca jovem = new Crianca("joao","masculino");

        jovem.estudar(true);

        bebe.respirar("Jaum");


    }
}
