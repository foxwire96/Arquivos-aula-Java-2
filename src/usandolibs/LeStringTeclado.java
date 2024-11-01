package usandolibs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite uma tecla: ");
		//InputStream é a classe que sabe capturar um byte
		//recebendo da entrada padrão do sistema
		InputStream is = System.in;
		//InputStream é a classe que sabe receber um byte 
		//e transforma em um char
		InputStreamReader isr = new InputStreamReader(is);
		//BufferedReader sabe receber vários char e agrupar String
		BufferedReader br = new BufferedReader(isr);
		String s;
		s = br.readLine();
		System.out.println("Você digitou a frase: "+s);

	}

}
