package br.DigitalHouse.Revisao;

public class Cliente extends Pessoa{

    private int codigo;


    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }


    @Override
    public void imprimeDados() {
        System.out.println(super.getNome()+"\n"+super.getNascimento().toString() + "\n" + codigo);



    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
