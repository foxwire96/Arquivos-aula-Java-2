package aula0;

public class EstruturasDeControle7 {
	public static void main(String[] args) {
		rotuloLoop: for (int i = 0; i < 3; i++) {
			System.out.println("Estou dentro do for(i)");
			for (int j = 0; j < 3; j++) {
				System.out.println("Estou dentro do for(j)");
				if (j == 2)
					continue rotuloLoop;
			}
			System.out.println("Estou dentro do for(i)");
		}
		System.out.println("Estou dentro do for(i)");
	}
}