package sistemabancario;

public class TestaConta2 {
	public static void main(String[] args) {
		Conta c1;
		c1 = new Conta();
		c1.limite = 100;
		
		int i;
		i =10;
		
		Conta c2;
		c2 = c1;
		c2.limite = 200;
		
		System.out.println("Limite de c1: "+c1.limite);
		
		System.out.println("Limite de c2: "+c2.limite);
	}

}
