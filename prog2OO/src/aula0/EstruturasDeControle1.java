package aula0;

public class EstruturasDeControle1 {
	public static void main(String[] args) {
		double nota = 5.3; 

		if (nota >= 9) {
			System.out.println("Excelente! <3");
		} else if (nota < 9 && nota >= 8) {
			System.out.println("Ótimo");
		} else if (nota < 8 && nota >= 6) {
			System.out.println("Bom");
		} else if (nota < 6 && nota >= 5) {
			System.out.println("Suficiente!@");
		} else {
			System.out.println("Você falhou, estude novamente");
		}
		
	}
}