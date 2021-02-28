package service;

import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.util.Scanner;

public class OperacaoService {

    Scanner input = new Scanner(System.in);

    public Cliente saque(Cliente cliente) {
        System.out.println("Quanto você deseja sacar?");
        var valor = input.nextDouble();
        cliente.setSaldo(cliente.getSaldo() - valor);
        System.out.println("Seu novo saldo é: "+cliente.getSaldo());
        return cliente;
    }

    public Cliente deposito(Cliente cliente) {
        System.out.println("Quanto você deseja depositar?");
        var valor = input.nextDouble();
        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("Seu novo saldo é: "+cliente.getSaldo());
        return cliente;
    }

    public Cliente extrato(Cliente cliente) {
        if(cliente.getClass() == PessoaFisica.class){
            System.out.println("Os dados da conta são:\n\n" +
                    "Nome: "+cliente.getNome()+"\n" +
                    "CPF: "+((PessoaFisica) cliente).getCpf()+"\n" +
                    "Data de nascimento: "+((PessoaFisica) cliente).getDataDeNascimento()+"\n" +
                    "Saldo: "+cliente.getSaldo());
        }
        else if(cliente.getClass() == PessoaJuridica.class){
            System.out.println("Os dados da conta são:\n\n" +
                    "Nome da empresa: "+cliente.getNome()+"\n" +
                    "CNPJ: "+((PessoaJuridica) cliente).getCnpj()+"\n" +
                    "Saldo: "+cliente.getSaldo());
        }

        return cliente;
    }
}
