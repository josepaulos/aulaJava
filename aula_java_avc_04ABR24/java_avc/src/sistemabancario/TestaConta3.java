package sistemabancario;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Clayton";
		
		Conta c2 = c1;
		//		Conta c2 = new Conta();
//		c2.nome = "Clayton";
//		int c1 = 10;
//		int c2 = 10;
		
		if (c1 == c2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}

}
