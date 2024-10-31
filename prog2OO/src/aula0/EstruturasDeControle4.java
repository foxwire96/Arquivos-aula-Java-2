package aula0;

public class EstruturasDeControle4 {
	public static void main(String[] args) {
		String nomes[] = {"Alisson","Anderson","Apolo","Arthur","Caio"};

		String searchName = "Thamires";

		boolean foundName = false;

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(searchName)) {
				foundName = true;
				break; //sai do laço mais próximo
			}
		}
		
		if (foundName) {
			System.out.println(searchName+" encontrado na lista!");
		} else {
			System.out.println(searchName+" NÃO encontrado na lista!");
		}


	}
}