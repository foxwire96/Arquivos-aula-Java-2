package javaoo;

public class TestaConta2 {
	public static void main(String[] args) {

		Conta2 c2 = new Conta2();
		
		//inicializacao agora do objeto c2, que é uma cópia de Conta
		c2.numero = 001;
		c2.nome = "Murilo";
		c2.saldo = 100.0;
		c2.limite = 100.0;
		
		System.out.println("Numero da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);
		
		double valor1 = 2000;
		boolean resultado1 = c2.sacar(valor1);
		if(resultado1) {
			System.out.println("Você sacou R$"+valor1+" e seu saldo atual é: "+c2.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do possível");
		}
		
		             
		c2.depositar(50);
		System.out.println("Saldo atual: "+c2.saldo);
		
		c2.sacar(200);
		System.out.println("Saldo atual: "+c2.saldo);
		
		c2.sacar(1000);
		System.out.println("Saldo atual: "+c2.saldo);
	}

}
