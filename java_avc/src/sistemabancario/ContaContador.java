package sistemabancario;

public class ContaContador {
	private static int contadorContas;
	private int numero;
	private double saldo;
	private double limite;
	private Cliente cliente = new Cliente();
	
	public ContaContador(String nome, String cpf) {
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		ContaContador.contadorContas++;
		
	}
	
	public static int getContadorContas() {
		return contadorContas;
	}

	public static void setContadorContas(int contadorContas) {
		ContaContador.contadorContas = contadorContas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	

	
	

}
