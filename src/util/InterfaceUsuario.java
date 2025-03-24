package util;
import java.util.Scanner;


public class InterfaceUsuario {

    // Melhor escolha: criar um construtor para inicializar o Scanner, evitando repeti-lo em cada um dos métodos de inserção de dados.
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    // MÉTODOS 
    // Método para pedir valor do imóvel. 
    public double pedirValorImovel() {
        double valorImovel;
        while (true) {
            System.out.print("Digite o valor do imóvel: ");
            valorImovel = scanner.nextDouble();
            if (valorImovel > 0) {
                break;
            } else {
                System.out.println("O valor do imóvel deve ser positivo. ");
            }
        }
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;
        while (true) {
            System.out.print("Insira o prazo de financiamento do imóvel em anos: ");
            prazoFinanciamento = scanner.nextInt();
            if (prazoFinanciamento > 0) {
                break;
            } else {
                System.out.print("O prazo de financiamento deve ser um número positivo. ");
            }
        }
        return prazoFinanciamento;
    }

    public double pedirTaxaJurosAnual() {
        double taxaJurosAnual;
        while (true) {
            System.out.println("Insira a taxa de juros anual: ");
            taxaJurosAnual = scanner.nextDouble();
            if (taxaJurosAnual > 0) {
                break;
            } else {
                System.out.print("A taxa de juros anual deve ser um número positivo. ");
            }
        }
        return taxaJurosAnual;
    }

    public int mostrarMenuFinanciamentos(){
        System.out.println("\n=== SELECIONE O TIPO DE FINANCIAMENTO");
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println("3 - Terreno");
        System.out.println("4 - Sair");
        return scanner.nextInt();
    }

}

