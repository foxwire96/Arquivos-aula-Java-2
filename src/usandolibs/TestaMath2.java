package usandolibs;

public class TestaMath2 {

	public static void main(String[] args) {
		//Teste as funções: random, max, min, exp
		//pow, sqrt, sin, toDegrees, toRadians
		//random() gera numeros entre 0.0 e 0.99
		double nroAleatorio = Math.random();
		System.out.println(nroAleatorio);
		System.out.println(Math.max(2, 4));
		System.out.println(Math.min(2, 4));
		System.out.println(Math.exp(2));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(10));
		System.out.println(Math.sin(Math.toRadians(90)));
	}

}
