package br.DigitalHouse.Revisao;

public class Gerente extends Funcionario {

    public String vaga;


    public Gerente(String nome, Data nascimento, int salario) {
        super(nome, nascimento, salario);

    }

    @Override
        public float calculaImposto(){
            float calImposto = (float) (this.getSalario() * 0.05);
            return calImposto;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }
}
