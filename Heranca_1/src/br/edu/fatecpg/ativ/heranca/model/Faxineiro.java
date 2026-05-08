package br.edu.fatecpg.ativ.heranca.model;

public class Faxineiro implements Funcionario {
    private String nome;

    public Faxineiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está limpando e higienizando o ambiente. Tá ficando brilhoso.");
    }

    public void solicitarMaterial() {
        System.out.println(nome + " solicitou mais produtos de limpeza ao gerente.");
    }
}