package br.digitalhouse.objetosJava;

public class Animal {
    private String nomeAnimal;
    private String raca;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;

        //construtor especifico
    public Animal (String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;

    }
        //Construtor padrão (quanado criamos ele, podemos manipular uma class)
    public Animal (){

    }
    //Exemplo de get
    public String getNomeAnimal(){
        return nomeAnimal;
    }
    public int getIdaade(){
        return idade;
    }
    public String getRaca(){
        return raca;
    }
    public String getCor(){
        return cor;
    }

    public Pessoa getDonoAnimal() {
        return donoAnimal;
    }

    public void brincar(){
        System.out.println("O animal esta brincando");
    }

    //set

    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }

    public void setRaca(String novaRaca){
        raca = novaRaca;
    }

    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

    public void setDonoAnimal(Pessoa donoAnimal) {
        donoAnimal = donoAnimal;
    }
}
