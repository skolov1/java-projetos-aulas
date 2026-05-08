package br.edu.fatecpg.ativ.heranca.view;

import br.edu.fatecpg.ativ.heranca.model.Pagamento;
import br.edu.fatecpg.ativ.heranca.model.PagamentoCartao;
import br.edu.fatecpg.ativ.heranca.model.PagamentoDinheiro;

public class Main {
    public static void main(String[] args) {
        double valorDaCompra = 100.00;

        Pagamento pagamento1 = new PagamentoCartao(valorDaCompra);
        Pagamento pagamento2 = new PagamentoDinheiro(valorDaCompra);

        System.out.println("Processando pagamento 1...");
        System.out.println(pagamento1.emitirRecibo());
        

        System.out.println("Processando pagamento 2...");
        System.out.println(pagamento2.emitirRecibo());
    }
}
