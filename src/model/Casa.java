package model;

public class Casa extends Financiamento {
    // Atributos específicos do financiamento da casa.
    private double areaConstruida;
    private double areaTerreno;

    // Crio um construtor
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        // SUPER permite acessar a classe pai.
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calculoPagamentoMensal() {
        double pagamentoMensal = (getValorImovel() / (getPrazoFinanciamento() * 12) * (1 + (getTaxaJurosAnual() / 12)) * 1.02);
        return pagamentoMensal;
    }

    public double pagamentoSeguroObrigatorio() {
        return calculoPagamentoMensal() + 80;
    }

    @Override
    public String getTipoImovel() {
        return "Casa";
    }

}
