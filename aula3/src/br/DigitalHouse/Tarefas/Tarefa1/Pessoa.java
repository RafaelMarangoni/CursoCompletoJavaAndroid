package br.DigitalHouse.Tarefas.Tarefa1;
import javax.xml.crypto.Data;

public abstract class Pessoa {
    private String nome;
    private String nascimento;

    public Pessoa (String nome, String nascimento){
        this.nascimento = nascimento;
        this.nome = nome;
    }

}
