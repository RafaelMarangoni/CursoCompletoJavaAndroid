package br.DigitalHouse.Revisao;

public class Data {
    private int data;
    private int mes;
    private int ano;

    public Data(int data, int mes, int ano){

        this.data = data;
        this.mes = mes;
        this.ano = ano;

    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
