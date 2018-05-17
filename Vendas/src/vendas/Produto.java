package br.com.cadastro;

public class Produto {
	private int cod;
	private String nome;
	private double peso;
	private double tam;
	
	public Produto(int cod, String nome, double peso, double tam) {
		this.cod = cod;
		this.nome = nome;
		this.peso = peso;
		this.tam = tam;
	}

	
	public String toString() {
		return " Produto cod: " + cod + "\n nome: " + nome + "\n peso: " + peso + "\n tam: " + tam;
	}
	
	
}
