package br.DigitalHouse.Tarefas.Tarefa1;

public class Principal {

    public static void main(String[] args) {

        Funcionario junior = new Funcionario("Camila","31-05-93");

        junior.setSalario(2000);
        System.out.println(junior.getSalario());


        System.out.println("seu salario é " + " " + junior.getSalario() + " e o imposto a ser cobrado é " + junior.calculaImposto());
    }
}
