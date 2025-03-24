package model;

public class Terreno extends Financiamento{
    String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona){
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calculoPagamentoMensal(){
        double pagamentoMensal = (getValorImovel() / (getPrazoFinanciamento() * 12) * (1 + (getTaxaJurosAnual() / 12)) * 1.02);
        double pagamentoSemAcrescimo = calculoPagamentoMensal();
        double pagamentoComAcrecimo = pagamentoSemAcrescimo * 1.02;
        return pagamentoComAcrecimo;
    }

}
