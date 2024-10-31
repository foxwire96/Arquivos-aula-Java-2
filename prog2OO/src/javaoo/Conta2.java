package javaoo;

public class Conta2 {
	int numero;
	String nome;
	double saldo;
	double limite;

	//vamos implementar a técnica de marcação booleana para validar nossa RN (regra de negócio)
	boolean sacar(double valor){
		if (valor <= this.saldo+this.limite) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	void depositar(double valor){
		this.saldo = this.saldo + valor;
	}



}
