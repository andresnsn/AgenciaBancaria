package model;

public class PessoaFisica extends Cliente{

    String cpf;
    String dataDeNascimento;

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
