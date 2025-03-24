package model;

public class Casa extends Financiamento{
    // Crio um construtor
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        // SUPER permite acessar a classe pai.
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calculoPagamentoMensal() {
        double pagamentoMensal =  (getValorImovel() / (getPrazoFinanciamento() * 12) * (1 + (getTaxaJurosAnual() / 12)) * 1.02);
        return pagamentoMensal;
    }

    public double pagamentoSeguroObrigatorio(){
        return calculoPagamentoMensal() + 80;
    }
}
