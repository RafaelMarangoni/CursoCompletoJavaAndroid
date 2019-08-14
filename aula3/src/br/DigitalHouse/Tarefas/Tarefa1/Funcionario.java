package br.DigitalHouse.Tarefas.Tarefa1;

import javax.xml.crypto.Data;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, String nascimento) {
        super(nome, nascimento);
    }

    public void setSalario(float salario) {
        this.salario = salario;

    }

    public float getSalario() {
        return salario;

    }

    public double calculaImposto(){
        setSalario(getSalario()* 3 / 100);
        System.out.println(getSalario());
        return getSalario();
    }

}
