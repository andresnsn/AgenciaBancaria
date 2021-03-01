package model;

public class PessoaFisica extends Cliente{

    String cpf;
    String dataDeNascimento;

    /* Aqui neste método construtor, eu determino que durante a instanciação do objeto,
     * um valor de saldo será adicionado a ele como requisito.*/

    public PessoaFisica() {
        super.saldo = 200.0;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
