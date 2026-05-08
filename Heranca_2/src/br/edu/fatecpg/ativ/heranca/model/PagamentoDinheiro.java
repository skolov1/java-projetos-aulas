package br.edu.fatecpg.ativ.heranca.model;

public class PagamentoDinheiro implements Pagamento {
    private double valorOriginal;

    public PagamentoDinheiro(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    @Override
    public double calcularPagamento() {
        return valorOriginal - (valorOriginal * 0.10); 
    }

    @Override
    public String emitirRecibo() {
        double valorFinal = calcularPagamento();
        double desconto = valorOriginal - valorFinal;
        
        return String.format("""
               --- RECIBO: PAGAMENTO EM DINHEIRO ---
               Valor Original: R$ %.2f
               Desconto Aplicado (10%%): R$ %.2f
               Valor Total a Pagar: R$ %.2f
               -------------------------------------""", 
               valorOriginal, desconto, valorFinal);
    }
}
