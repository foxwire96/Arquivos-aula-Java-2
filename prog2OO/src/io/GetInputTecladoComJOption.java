package io;

import javax.swing.JOptionPane;

public class GetInputTecladoComJOption {
	public static void main(String[] args) {
		String nome;
		nome = JOptionPane.showInputDialog("Insira seu nome:");
		String msg = "Olá, seja bem vindo "+nome+"!";
		JOptionPane.showMessageDialog(null, msg);
	}
}