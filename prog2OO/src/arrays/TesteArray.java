package arrays;

public class TesteArray {
	public static void main(String[] args) {
//		int[] notas;
		//declaracao do array
		int notas[];
		
		//construcao do array
		notas = new int[100];
		
		//declaracao e construcao na mesma linha
		int notass[] = new int[100];
		
		int nota; //declaracao
		nota = 3; //atribuição ou inicializacao
		
		//declarar e inicializar na mesma linha -> construcao ja esta implicita
		int notasss[] = {5,6,7,8};
		
		String diasDaSemana[] = {"Seg","Ter","Qua","Qui","Sex","Sab","Dom"};
		
		System.out.println(diasDaSemana[2]);
		
		
		
	}

}