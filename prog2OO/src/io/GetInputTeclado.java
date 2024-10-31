package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//I/O através de BufferedReader
public class GetInputTeclado {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String nome = null;
		System.out.println("Digite seu nome:");
		try {
			nome = bf.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Olá, seja bem vindo "+nome+"!");
		
	}

}
