package aula0;

public class EstruturasDeControle5 {
	public static void main(String[] args) {
		int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int searchNumero = 5;
		boolean foundNumero = false;
		
		rotulaPesquisa: for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
				if (searchNumero == numbers[i][j]) {
					foundNumero = true;
					break rotulaPesquisa;//esse break, diferente do outro, 
					//sai na altura do rótulo
				}	
			}
		}
		
		if (foundNumero) {
			System.out.println(searchNumero+" encontrado na matrix!");
		} else {
			System.out.println(searchNumero+" NÃO encontrado na matrix!");
		}
	}
}