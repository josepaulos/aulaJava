package sistemabancario;

public class TestaConta2Cliente {
	public static void main(String[] args) {
		Conta2 c2 = new Conta2();
//		Cliente cliente1 = new Cliente();
//		cliente1.nome = "Clayton";
//		c2.cliente = cliente1;
		c2.saldo = 100;
		System.out.println("Saldo: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);
		c2.cliente.nome = "Clayton";
		System.out.println("Nome: "+c2.cliente.nome);
	}

}
