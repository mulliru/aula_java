package br.com.fiap.beans;

public class Cliente {

	// visibilidade, tipo de variavel
	private String nome;
	private int idade;
	private double valor;

	// Setters (entrada)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;

	}

	public void setValor(double valor) {
		this.valor = valor;

	}

	// Getters (saida)

	public String getNome() {
		return nome;

	}

	public int getIdade() {
		return idade;

	}

	public double getValor() {
		return valor;

	}

}
