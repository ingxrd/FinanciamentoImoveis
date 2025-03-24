package model;

public class Financiamento {
    // Atributos privados
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    //construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //Métodos getters e setter

    //Método get e set = valorImovel 

    public double getValorImovel(){
        return valorImovel;
    }

    public void setValorImovel(double valorImovel){
        this.valorImovel = valorImovel;
    }

    // Método get e set = prazoFinanciamento
    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }

    public void setPrazoFinanciamento(int prazoFinanciamento){
        this.prazoFinanciamento = prazoFinanciamento;
    }

    //Método get e set = taxaJurosAnual
    public double getTaxaJurosAnual(){
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual){
        this.taxaJurosAnual = taxaJurosAnual;
    }


    // MÉTODOS

    // Método que calcula pagamento mensal do financiamento. 

    public double calculoPagamentoMensal(){
        double pagamentoMensal = (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
        return pagamentoMensal;
    }

    public double calculoPagamentoTotal(){
        double pagamentoMensal = calculoPagamentoMensal();
        double pagamentoTotal = pagamentoMensal * prazoFinanciamento * 12;
        return pagamentoTotal;
    }

    
}
