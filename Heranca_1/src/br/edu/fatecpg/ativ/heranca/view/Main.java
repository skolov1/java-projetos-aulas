package br.edu.fatecpg.ativ.heranca.view;

import br.edu.fatecpg.ativ.heranca.model.Faxineiro;
import br.edu.fatecpg.ativ.heranca.model.Gerente;
import br.edu.fatecpg.ativ.heranca.model.Vendedor;

public class Main {
	public static void main(String[] args) {
        Gerente gerente = new Gerente("Mônica");
        Vendedor vendedor = new Vendedor("Jonas");
        Faxineiro faxineiro = new Faxineiro("José");

        System.out.println("--- Gerente ---");
        gerente.baterPonto();
        gerente.trabalhar();
        gerente.fecharCaixa(); 
        gerente.verificarEstoque();

        System.out.println("\n--- Vendedor ---");
        vendedor.baterPonto();
        vendedor.trabalhar();
        vendedor.realizarVenda(); 
        vendedor.verificarVitrine();
        
        System.out.println("\n--- Faxineiro ---");
        faxineiro.baterPonto();
        faxineiro.trabalhar();
        faxineiro.solicitarMaterial(); 
    }
}
