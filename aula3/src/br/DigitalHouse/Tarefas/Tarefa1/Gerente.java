package br.DigitalHouse.Tarefas.Tarefa1;

public class Gerente extends Pessoa {
    private float salario;

    public Gerente(String nome, String nascimento) {
        super(nome, nascimento);
    }

    public void setSalario(float salario) {
        this.salario = salario;
        System.out.println(getSalario());
    }

    public float getSalario() {
        return salario;
    }

    public void calculaImposto(){
        setSalario(getSalario()* 5 / 100);
    }

}


