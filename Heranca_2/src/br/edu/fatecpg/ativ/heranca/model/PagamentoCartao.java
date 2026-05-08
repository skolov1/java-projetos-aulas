package br.edu.fatecpg.ativ.heranca.model;

public class PagamentoCartao implements Pagamento {
	private double valorOriginal;
	
    public PagamentoCartao(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    @Override
    public double calcularPagamento() {
        return valorOriginal + (valorOriginal * 0.05); 
    }

    @Override
    public String emitirRecibo() {
        double valorFinal = calcularPagamento();
        double taxa = valorFinal - valorOriginal;
        
        return String.format("""
               --- RECIBO: PAGAMENTO EM CARTÃO ---
               Valor Original: R$ %.2f
               Taxa Aplicada (5%%): R$ %.2f
               Valor Total a Pagar: R$ %.2f
               -----------------------------------""", 
               valorOriginal, taxa, valorFinal);
    }
}
