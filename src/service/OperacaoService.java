package service;

import model.Cliente;

import java.util.Scanner;

public class OperacaoService {

    Scanner input = new Scanner(System.in);

    public Cliente saque(Cliente cliente) {
        System.out.println("Quanto você deseja sacar?");
        Double valor = input.nextDouble();
        cliente.setSaldo(cliente.getSaldo() - valor);
        System.out.println("Saldo atual do cliente dentro de operações: "+cliente.getSaldo());

        return cliente;
    }


}
