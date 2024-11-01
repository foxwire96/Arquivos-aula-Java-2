package usandolibs;

import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		//InputStream é a classe que sabe capturar um byte
		//recebendo da entrada padrão do sistema
		InputStream is = System.in;
		//InputStreamReader é a classe que sabe receber um byte
		//e transforma em um char
		InputStreamReader isr = new InputStreamReader(is);
		//BufferedReader sabe receber vários char e agrupar em String
		char c;
		c = (char) isr.read();
		System.out.println("Vc digitou a tecla: "+c);
		
	}

}
