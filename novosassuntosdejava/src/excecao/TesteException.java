package excecao;

public class TesteException {
	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");
		metodo1();
		System.out.println("Fim do método main");
	}

	private static void metodo1() {
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método1");
	}

	private static void metodo2() {
		System.out.println("Início do método 2");
		int array[];
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("Fim do método 2");

	}

}









