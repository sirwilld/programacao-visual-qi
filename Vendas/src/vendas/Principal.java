package br.com.cadastro;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Controle controle = new Controle();
		
		//System.out.print(controle);
		JOptionPane.showMessageDialog(null, controle.toString());
	}

}
