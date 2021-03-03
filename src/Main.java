import appstart.AppStart;

public class Main {

    /*
    Aqui no método main, eu deixei apenas um Singleton que inicia a aplicação. Este Singleton está no pacote "appstart".
    A aplicação funciona de maneira retilínea, e assim que é terminado o seu percurso lógico, encerra e descarta as informações
    de tempo de execução, já que a ideia é focar na implementação da orientação a objetos. Também não possui tratativas de erro.
     */

    public static void main(String[] args) {

    AppStart.getInstance().iniciarAplicacao();

    }
}
