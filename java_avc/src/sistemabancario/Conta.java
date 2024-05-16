package sistemabancario;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;
	
//	void sacar(double valor) {
//		double saldoAlterado = saldo - valor;
//		saldo = saldoAlterado;
//	}
	
	boolean sacar(double valor) {
		if ((this.saldo+this.limite) < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			//this.saldo -= valor;
			return true;
		}
	}
	
	void depositar(double valor) {
		this.saldo = this.saldo + valor;
//		this.saldo += valor;
	}
	

}
