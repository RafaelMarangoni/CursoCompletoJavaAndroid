package br.DigitalHouse.HerançaClasseAbstrata;

public class Cliente {
    private int id;
    private String sobrenome;
    private int RG;
    private int CPF;

    public Cliente(int id, String sobrenome, int RG, int CPF){
        this.id = id;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
