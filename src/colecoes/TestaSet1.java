package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestaSet1 {

	public static void main(String[] args) {
		Set<String> objetos = new HashSet<String>();
		objetos.add("Leonardo");
		objetos.add("Alisson");
		objetos.add("Apolo");
		objetos.add("Apolo");
		System.out.println(objetos);
		
		for (String objetoIndividual: objetos) {
			System.out.println(objetoIndividual);
		}
	}

}
