package model;

public class Terreno extends Financiamento{
    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona){
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public double calculoPagamentoMensal(){
        return (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + (getTaxaJurosAnual()/12)) * 1.02;

    }

    @Override
    public String getTipoImovel() {
        return "Terreno";
    }

}
