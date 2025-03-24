package model;

public abstract class Financiamento {
    // Posso escolher trabalhar com protected ou private. No caso de protected, retiro os métodos getters e setters porque as subclasses conseguem acessá-los.
    // Optei por usar private e continuar usando os métodos getters e setters.
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

    //valorImovel

    public double getValorImovel(){
        return valorImovel;
    }

    public void setValorImovel(double valorImovel){
        this.valorImovel = valorImovel;
    }

    //prazoFinanciamento
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

    // Para que seja uma classe abstrata, preciso que um metodo seja corretamente abstrato.
    // Motivo da escolha calculoPagamentoMensal: cada uma das minhas subclasses - terreno, casa e apartamento - pode ter um calculo diferente do pagamento mensal.
    //
    public abstract double calculoPagamentoMensal(); // A subclasse deve implementar este metodo da melhor forma.

    public double calculoPagamentoTotal(){
        double pagamentoMensal = calculoPagamentoMensal();
        double pagamentoTotal = pagamentoMensal * prazoFinanciamento * 12;
        return pagamentoTotal;
    }

    public abstract String getTipoImovel();
    
}
