package javaoo;

public class TestaConta {
	public static void main(String[] args) {
		int i;
		Conta c1; //declaracao
		c1 = new Conta(); //instanciacao 
		//poderia fazer a declaracao e instanciacao
		//na mesma linha -> Conta c1 = new Conta();
		
		//inicializacao agora do objeto c1, que é uma cópia de Conta
		c1.numero = 001;
		c1.nome = "Murilo";
		c1.saldo = 100.0;
		c1.limite = 100.0;
		
		System.out.println("Numero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
		c1.sacar(20);
		System.out.println("Saldo atual: "+c1.saldo);
		
		c1.depositar(50);
		System.out.println("Saldo atual: "+c1.saldo);
		
		c1.sacar(200);
		System.out.println("Saldo atual: "+c1.saldo);
		
		c1.sacar(1000);
		System.out.println("Saldo atual: "+c1.saldo);
	}

}
