package usandolibs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {

	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("teste.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		s = br.readLine(); //so le uma linha
		System.out.println(s+"\n");
		
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
			
		}
		
		br.close();
		isr.close();
		is.close();
	}

}
