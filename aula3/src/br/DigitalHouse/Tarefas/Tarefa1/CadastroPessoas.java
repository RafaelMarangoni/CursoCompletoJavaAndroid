package br.DigitalHouse.Tarefas.Tarefa1;

public class CadastroPessoas {

    private int qntAtual;



    public void setQntAtual(int qntAtual) {
        this.qntAtual = qntAtual;
    }

    public int getQntAtual() {
        return qntAtual;
    }

    public void cadastrarPessoas(int novoCadastro){

        this.setQntAtual(getQntAtual() + novoCadastro);
    }
    public void imprimeCadastro(){
        System.out.println(getQntAtual());
    }

}
