package javaoo;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;

	void sacar(double valor){
		//double novoSaldo = saldo - valor;
		//saldo = novoSaldo;
		saldo = saldo - valor;
		//saldo -= valor;
	}

	void depositar(double valor){
		this.saldo = this.saldo + valor;
	}



}
