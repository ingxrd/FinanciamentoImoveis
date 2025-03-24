package model;

public class Casa extends Financiamento{
    // Crio um construtor
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        // SUPER permite acessar a classe pai.
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double pagamentoSeguroObrigatorio(){
        return super.calculoPagamentoMensal()+80;
    }
}
