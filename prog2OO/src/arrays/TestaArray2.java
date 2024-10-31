package arrays;

public class TestaArray2 {
	public static void main(String[] args) {
		int[] idades = new int[100]; //declaracao e construcao
		for (int i = 0; i < 100; i++) {
			idades[i] = i; //inicializacao
			System.out.println(idades[i]);
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
