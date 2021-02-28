import model.PessoaFisica;
import model.PessoaJuridica;
import auxiliar.ClasseInjetoraDeDependencias;

public class Main {

    public static void main(String[] args) {

        ClasseInjetoraDeDependencias conta = new ClasseInjetoraDeDependencias();

        System.out.println("Olá, vamos começar!");

        while(conta.opcao != 1 && conta.opcao != 2){
            System.out.println("\nSelecione o tipo de conta que deseja cadastrar:\n\n1- Pessoa Física\n2- Pessoa Jurídica");
            conta.opcao = conta.input.nextInt();

            switch(conta.opcao){
                case 1:
                    conta.cliente = conta.cadastroService.cadastrar(new PessoaFisica());
                    break;
                case 2:
                    conta.cliente = conta.cadastroService.cadastrar(new PessoaJuridica());
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        }

        while(conta.operacao != 0) {
            System.out.println("\n1- Saque\n2- Depósito\n3- Extrato\n0- Sair");
            conta.operacao = conta.input.nextInt();

            switch(conta.operacao){
                case 1:
                    conta.cliente = conta.operacaoService.saque(conta.cliente);
                    break;
                case 2:
                    conta.cliente = conta.operacaoService.deposito(conta.cliente);
                    break;
                case 3:
                    conta.cliente = conta.operacaoService.extrato(conta.cliente);
                    break;
                default:
                    if(conta.operacao != 0){
                        System.out.println("Opção inválida!");
                    }
                    else{
                        System.out.println("Finalizando sistema...");
                    }

            }

        }

    }
}
