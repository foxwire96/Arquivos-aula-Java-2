package io;

import java.util.Scanner;

public class GetInputTecladoComScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Olá, seja bem vindo "+nome+"!");
		sc.close();
		
	}

}
