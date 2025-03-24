package model;

public class Apartamento extends Financiamento {

    int numVagasGaragem;
    int numAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numVagasGaragem, int numAndar){
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    // Uso do Override para substituiçao do calculo do apartamento.
    @Override
    public double calculoPagamentoMensal(){
        double taxaMensal = this.getTaxaJurosAnual() / 12 / 100;
        int meses = this.getPrazoFinanciamento() * 12;
        double fator = Math.pow(1+taxaMensal, meses);
        double parcelaMensal = this.getValorImovel() *  fator / (fator-1);
        return parcelaMensal;
    }
}
