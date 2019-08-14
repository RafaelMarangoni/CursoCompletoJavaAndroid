package br.DigitalHouse.HerançaClasseAbstrata;

public abstract class Pessoa {
    protected String nome ;
    private int CPF;
    private String sobreNome;
    protected String sexo;

    public  Pessoa (String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public abstract void respirar(String nome);

    public void cadastroPessoa(String nome, String sobreNome){
        System.out.println("dados da pEssoa:"+ nome + " " + sobreNome);
    }
    public void cadastroPessoa(String nome, String sobreNome ,String sexo){
        System.out.println("dados atualizados:" + nome + "e" + sexo);
    }

    public void cadastroPessoa(String nome){
        System.out.println("Dados simples:" + nome);
    }

    public boolean estudar(boolean status){
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
}
