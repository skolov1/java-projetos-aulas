package br.edu.fatecpg.ativ.heranca.model;

public class Vendedor implements Funcionario {
    private String nome;

    public Vendedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void baterPonto() {
        System.out.println(nome + " registrou o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está atendendo clientes.");
    }

    public void realizarVenda() {
        System.out.println(nome + " realizou uma venda com sucesso!");
    }
    
    public void verificarVitrine() {
    	System.out.println(nome + " está verificando e arrumando a vitrine.");
    }
}