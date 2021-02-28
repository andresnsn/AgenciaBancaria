package model;

public class PessoaJuridica extends Cliente{

    public PessoaJuridica() {
        super.saldo = 0.0;
    }

    String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
