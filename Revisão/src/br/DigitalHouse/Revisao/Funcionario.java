package br.DigitalHouse.Revisao;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, Data nascimento,int salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto(){
        float calImposto = (float) (salario * 0.03);
        return calImposto;
    }

    @Override
    public void imprimeDados() {
        float salarioComImposto = getSalario() - calculaImposto();
        System.out.println("O valor final do calculo é de :" +salarioComImposto);

    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
