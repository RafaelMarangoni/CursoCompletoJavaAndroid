package br.DigitalHouse.HerançaClasseAbstrata;

public class Crianca extends Pessoa {

    public Crianca(String nome, String sexo) {
        super(nome, sexo);

        super.sexo = sexo;
    }

    @Override
    public void respirar(String nome) {
        System.out.println("A pessoa"+ " "+ nome +" " + "esta respirando");
    }

    @Override
    public boolean estudar(boolean status) {
        if(status){
            System.out.println("A criança esta estudando ! =)");
            return true;
        }else{
            System.out.println("Não tem ninguem estudando! =(");
            return false;
        }

    }
}
