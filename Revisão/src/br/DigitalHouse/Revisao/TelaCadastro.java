package br.DigitalHouse.Revisao;

public class TelaCadastro {
    public static void main(String[] args) {

        Data novaData = new Data(31,05,1989);
        Cliente novoCliente = new Cliente("Rafao",novaData,1234);
        novoCliente.imprimeDados();

        Data dataFuncionario  = new Data(10,10,1910);

        Funcionario novoFuncionario = new Funcionario("titchao", dataFuncionario, 5000);
        novoFuncionario.imprimeDados();

        Gerente novoGerente = new Gerente ("Gerente",novaData,10000);
        novoGerente.imprimeDados();

        CadastroPessoas novoCadastro = new CadastroPessoas();
        novoCadastro.cadastrarPessoa(novoGerente);
        novoCadastro.cadastrarPessoa(novoFuncionario);
        novoCadastro.cadastrarPessoa(novoCliente);
        novoCadastro.imprimeCadastro();


    }
}
