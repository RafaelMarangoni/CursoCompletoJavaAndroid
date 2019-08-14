package br.DigitalHouse.HerançaClasseAbstrata;

public class PrincipalExercicios {
    public static void main(String[] args) {

        ContaPoupanca rafael = new ContaPoupanca(1,"Marangoni",444444,5555555);
        rafael.deposito(20);

        rafael.sacar(10);
        rafael.getSaldo();

    }
}
