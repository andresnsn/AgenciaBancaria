package service;

import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;
import java.util.Scanner;

public class CadastroService {

    /*
    Aqui eu uso a mutabilidade dos objetos PF e PJ, que herdam de Cliente, implementando polimorfismo neste único método
    que pode receber os dois objetos. Uma vez que o objeto entra como atributo do parâmetro, é realizada
    a checagem do objeto que entrou na operação e, dependendo do tipo do objeto, a operação determinada
    para ele é acionada.
     */

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
            System.out.println("Qual o nome da empresa?");
            cliente.setNome(input.nextLine());
            System.out.println("Qual o seu CNPJ?");
            ((PessoaJuridica) cliente).setCnpj(input.nextLine());
        }

        return cliente;

    }
}
