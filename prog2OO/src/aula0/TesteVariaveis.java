package aula0;

public class TesteVariaveis {
	public static void main(String[] args) {
		boolean resultado; //declaração
		resultado = false; //atribuição
		//ou declaração e atribuição na mesma linha
		//boolean resultado = false;
		
		char c = 'f';
		
		byte b = 5;
		
		short s = 10;
		
		int i = 15;
		
		long x = 100L;
		
		double d = 1000.0;
		
		float h = 1500.0f;
		
//		System.out.println(i);
		
		System.out.println("O valor de i é: "+i);
		
		int j = i;
		
		System.out.println("O valor de j é: "+j);
		
		i = i + 1;
		
		System.out.println("O valor de i é: "+i);
		
		System.out.println("O valor de j é: "+j);
		
		
	}

}
