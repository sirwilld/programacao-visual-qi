package br.com.cadastro;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Controle{
	
	private int qnt;
	private double preco;
	
	Produto produto;
	
	DecimalFormat saida = new DecimalFormat("0.00");
	
	private void recebeValores() {
		int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo:"));
		String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso:"));
		double tam = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho:"));
		this.qnt = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade:"));
		this.preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preco:"));
		
		produto = new Produto(cod, nome, peso, tam);
	}
	
	private double calcularAcrescimo() {
		return this.preco * 1.3;
	}
	
	private double calcularLucroIndividual() {
		return calcularAcrescimo() - this.preco;
	}
	
	private double calcularLucroTotal() {
		double valorTotal = this.qnt *  this.preco;
		double totalVenda = this.qnt * calcularAcrescimo();
		
		return totalVenda - valorTotal;
	}
	
	public String toString() {
		recebeValores();
		return produto.toString() + "\n Quantidade: " + this.qnt + "\n Valor: " + this.preco + "\n Acrescimo: " + saida.format(calcularAcrescimo()) + "\n Lucro Individual: " + saida.format(calcularLucroIndividual()) + "\n Lucro Total: " + saida.format(calcularLucroTotal());
	}
}
