package sistemabancario;

public class TestaConta {
	public static void main(String[] args) {
//		Conta c1; //declarei o objeto c1 do tipo classe Conta
//		c1 = new Conta(); //contrução  ou instanciacao
		Conta c1 = new Conta(); //declaração e instanciação na mesma linha
		
		//Falta a inicialização
		c1.numero = 001;
		c1.nome = "Clayton";
		c1.saldo = 100.0;
		c1.limite = 200.0;
		
		System.out.println("Numero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("limite: "+c1.limite);
		
		int saque = 301; 
		boolean resultado = c1.sacar(saque);
		if (resultado) {
			System.out.println("Você sacou R$"+ saque);
			System.out.println("Seu saldo atual é: "+c1.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do possível");
		}
		
		Conta c2 = new Conta(); //declaração e instanciação na mesma linha
		
		//Falta a inicialização
		c2.numero = 002;
		c2.nome = "Maria";
		c2.saldo = 10.0;
		c2.limite = 20.0;
		
		int saque2 = 5; 
		boolean resultado2 = c2.sacar(saque2);
		if (resultado2) {
			System.out.println("Você sacou R$"+ saque2);
			System.out.println("Seu saldo atual é: "+c2.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do possível");
		}
		
//		c1.sacar(500);
//		System.out.println("Saldo atual: "+c1.saldo);
	}

}
