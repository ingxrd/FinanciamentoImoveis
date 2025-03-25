package util;
import java.util.Scanner;
import model.Apartamento;
import model.Casa;
import model.Financiamento;
import model.Terreno;


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

    public int mostrarMenuFinanciamentos() {
        System.out.println("\n=== SELECIONE O TIPO DE FINANCIAMENTO");
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println("3 - Terreno");
        System.out.println("4 - Sair");
        return scanner.nextInt();
    }

    public Financiamento criarFinanciamento() {
        int opcao = mostrarMenuFinanciamentos();

        if (opcao == 4) {
            return null;
        }
        
        // Dados comuns
        double valor = pedirValorImovel();
        int prazo = pedirPrazoFinanciamento();
        double taxa = pedirTaxaJurosAnual();
    
        switch(opcao) {
            case 1: // Casa
                System.out.print("Área construída (m²): ");
                double areaConstruida = scanner.nextDouble();
                System.out.print("Área do terreno (m²): ");
                double areaTerreno = scanner.nextDouble();
                return new Casa(valor, prazo, taxa, areaConstruida, areaTerreno);
                
            case 2: // Apartamento
                System.out.print("Número de vagas na garagem: ");
                int numVagasGaragem = scanner.nextInt();
                System.out.print("Número do andar: ");
                int numAndar = scanner.nextInt();
                return new Apartamento(valor, prazo, taxa, numVagasGaragem, numAndar);
                
            case 3: // Terreno
                scanner.nextLine(); // Limpa o buffer
                System.out.print("Tipo de Zona (Urbana/Rural): ");
                String tipoZona = scanner.nextLine();
                return new Terreno(valor, prazo, taxa, tipoZona);
                
            default:
                System.out.println("Opção inválida! Tente novamente.");
                return criarFinanciamento();
        }
    }
    }