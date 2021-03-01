package model;

public class PessoaJuridica extends Cliente{

    String cnpj;

    public PessoaJuridica() {
        super.saldo = 0.0;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
