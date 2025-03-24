import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // 1o passo após chamar a interface é pedir as infos de valor do imovel, fazo de financiamento e taxa anual.

        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento(); 
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();

        // 2o passo é instanciar objetos:

        Financiamento meuFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        
        // Arraylist para armazenar os financiamentos 
        ArrayList<Integer> financiamentos = new ArrayList<Integer>();
        financiamentos.add(meuFinanciamento);
        for (int i : financiamentos){
            System.out.println(i);
        }
        


        // exibir total dos valores dos imoveis 

        // exibir total dos valores dos financiamentos 

    }

}

