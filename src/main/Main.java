package main;

import java.util.ArrayList;

import model.Apartamento;
import model.Financiamento;
import model.Casa;
import model.Terreno;
import util.InterfaceUsuario;

public class Main {

    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        InterfaceUsuario ui = new InterfaceUsuario();
        ArrayList<Financiamento> lista = new ArrayList<>();
        double totalValorImoveisUsuario = 0;
        double totalFinanciamentosUsuario = 0;

        while (true) {
            Financiamento fin = ui.criarFinanciamento();
            if (fin == null) {
                break;
            }

            lista.add(fin);
            totalValorImoveisUsuario += fin.getValorImovel();
            totalFinanciamentosUsuario += fin.calculoPagamentoTotal();
            System.out.println("Adicionado: " + fin.getClass().getSimpleName());
        }

// Exibir totais dos financiamentos adicionados pelo usuário
        System.out.println("\nTotal de financiamentos criados pelo usuário: " + lista.size());
        System.out.println("Soma dos valores dos imóveis adicionados: R$ " + totalValorImoveisUsuario);
        System.out.println("Soma dos valores dos financiamentos adicionados: R$ " + totalFinanciamentosUsuario);


    /*
    // Coletar informações
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();

        // Criar financiamento
        //Financiamento meuFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        // Lista de financiamentos
        ArrayList<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();
        // Instancia objetos manualmente
        // Financiamento de Casa e Apartamento
        listaDeFinanciamentos.add(new Casa(4000, 40, 2.4, 50, 100));
        listaDeFinanciamentos.add(new Casa(50000, 43, 3.5, 50, 145));
        listaDeFinanciamentos.add(new Apartamento(4000, 43, 4.5, 0, 8));
        listaDeFinanciamentos.add(new Apartamento(4500, 43, 4.5, 1, 14));
        listaDeFinanciamentos.add(new Terreno(4000, 30, 5.5, "Urbana"));

        // Variáveis para totais
        double totalValorImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento fin : listaDeFinanciamentos){
            System.out.println("\nDetalhes do Financiamento:");
            System.out.println("Tipo de imóvel: " + fin.getTipoImovel());
            System.out.println("Valor do imóvel: R$ " + fin.getValorImovel());
            System.out.println("Taxa anual: " + (fin.getTaxaJurosAnual()) + "%");
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
        */


}}
