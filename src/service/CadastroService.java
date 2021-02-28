package service;

import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;

import java.util.Scanner;

public class CadastroService {

    Scanner input = new Scanner(System.in);

    public Cliente cadastrar(Cliente cliente) {

        if(cliente.getClass() == PessoaFisica.class) {
            System.out.println("Qual seu nome?");
            cliente.setNome(input.nextLine());
            System.out.println("Qual o seu CPF?");
            ((PessoaFisica) cliente).setCpf(input.nextLine());
            System.out.println("Qual a sua data de nascimento?");
            ((PessoaFisica) cliente).setDataDeNascimento(input.nextLine());

        }
        else if(cliente.getClass() == PessoaJuridica.class) {
            System.out.println("Pessoa Jurídica detectada!");
        }

        return cliente;

    }
}
