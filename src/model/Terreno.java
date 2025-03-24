package model;

public class Terreno extends Financiamento{
    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double calculoPagamentoMensal(){
        double pagamentoSemAcrescimo = super.calculoPagamentoMensal();
        double pagamentoComAcrecimo = pagamentoSemAcrescimo * 1.02;
        return pagamentoComAcrecimo;
    }

}
