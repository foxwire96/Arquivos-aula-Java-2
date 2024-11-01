package excecao;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException4 {
	public static void main(String[] args)  {
		String file = "arquivoDeTeste.txt";
		try {
			FileReader fl = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
