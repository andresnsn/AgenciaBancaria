package auxiliar;

import model.Cliente;
import service.CadastroService;
import service.OperacaoService;

import java.util.Scanner;

public class ClasseInjetoraDeDependencias {

    public Scanner input;
    public Cliente cliente;
    public CadastroService cadastroService;
    public OperacaoService operacaoService;
    public int opcao;
    public int operacao;

    public ClasseInjetoraDeDependencias(){
        this.cliente = new Cliente();
        this.input = new Scanner(System.in);
        this.cadastroService = new CadastroService();
        this.opcao = 0;
        this.operacao = 9;
        this.operacaoService = new OperacaoService();
    }



}
