package aula0;

public class EstruturasDeControle6 {
	public static void main(String[] args) {
		String nomes[] = {"Alisson","Anderson","Apolo","Arthur","Apolo","Caio"};
		
		int count = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			if (!nomes[i].equals("Apolo")) {
				continue;
			}
			count++;
		}
		System.out.println(count+" Apolo na lista de nomes dos alunos!");
		
	}
}