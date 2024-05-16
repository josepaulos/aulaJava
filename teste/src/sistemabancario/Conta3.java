package sistemabancario;

public abstract class Conta3 {
	int numero;
//	String nome;
	Cliente cliente;
//	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	
public Conta3() {
	cliente = new Cliente();
	}

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
