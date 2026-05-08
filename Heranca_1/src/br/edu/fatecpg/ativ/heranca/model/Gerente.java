package br.edu.fatecpg.ativ.heranca.model;

public class Gerente implements Funcionario {
	private String nome;
	
	public Gerente(String nome) {
		this.nome = nome;
	}

	@Override
	public void baterPonto() {
		System.out.println(nome + " registrou a entrada/saída no ponto.");
	}

	@Override
	public void trabalhar() {
		System.out.println(nome + " está gerenciando a equipe e analisando relatórios.");
	}
	
	public void fecharCaixa() {
        System.out.println(nome + " está conferindo e fechando o caixa do dia.");
    }
	
	public void verificarEstoque() {
        System.out.println(nome + " está verificando se falta algo no estoque.");
    }
}
