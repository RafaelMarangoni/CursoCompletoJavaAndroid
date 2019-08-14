package br.DigitalHouse.Interfaces;

public abstract class  Animal implements Brincavel{
    private String raca;
    private int idade;
    private String cor;


    public Animal(String raca){
        this.raca = raca;

    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {

        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
