package main;
import java.util.ArrayList;
import model.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // Coletar informações
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento(); 
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();

        // Criar financiamento
        Financiamento meuFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        
        // Lista de financiamentos
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();
        listaDeFinanciamentos.add(meuFinanciamento);
        
        // Variáveis para totais
        double totalValorImoveis = 0;
        double totalFinanciamentos = 0;
        
        // Exibir detalhes e calcular totais
        for (Financiamento fin : listaDeFinanciamentos){
            System.out.println("\nDetalhes do Financiamento:");
            System.out.println("Valor do imóvel: R$ " + fin.getValorImovel());
            System.out.println("Taxa anual: " + (fin.getTaxaJurosAnual() * 100) + "%");
            System.out.println("Prazo: " + fin.getPrazoFinanciamento() + " anos");
            System.out.println("Pagamento mensal: R$ " + fin.calculoPagamentoMensal());
            
            // Acumular totais
            totalValorImoveis += fin.getValorImovel();
            totalFinanciamentos += fin.calculoPagamentoTotal();
        }
        
        // Exibir totais
        System.out.println("\nTOTAIS:");
        System.out.println("Soma dos valores dos imóveis: R$ " + totalValorImoveis);
        System.out.println("Soma dos valores dos financiamentos: R$ " + totalFinanciamentos);
    }
}