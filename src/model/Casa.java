package model;

public class Casa extends Financiamento {
    // Atributos específicos do financiamento da casa.
    double areaConstruida;
    double areaTerreno;

    // Crio um construtor
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        // SUPER permite acessar a classe pai.
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calculoPagamentoMensal() {
        double pagamentoMensal = (getValorImovel() / (getPrazoFinanciamento() * 12) * (1 + (getTaxaJurosAnual() / 12)) * 1.02);
        return pagamentoMensal;
    }

    public double pagamentoSeguroObrigatorio() {
        return calculoPagamentoMensal() + 80;
    }

}
