package excecao;

public class TesteException3 {
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
		try {
			for (int i = 0; i < 20; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("erro pego (catched): "+e);
		}
		
		System.out.println("Fim do método 2");

	}

}









