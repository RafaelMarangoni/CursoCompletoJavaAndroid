package br.DigitalHouse.HerançaClasseAbstrata;

public class ContaPoupanca extends Cliente implements Contas{
    private double saldo;

    public ContaPoupanca(int id, String sobrenome, int RG, int CPF) {
        super(id, sobrenome, RG, CPF);
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return (int) saldo;
    }


    @Override
    public void deposito(double valor) {
        setSaldo(getSaldo()+ valor);
        System.out.println(getSaldo());
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo()-valor);
        System.out.println("teu saldo atual é" + " "+ getSaldo());
    }



    @Override
    public void consultar() {
        System.out.println(getSaldo());
    }

    public void sacarJuros(){

    }
}
