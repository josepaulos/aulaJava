package bibliotecas;

public class TesteString {
	public static void main(String[] args) {
		String a = new String("Java no Senac");
		String b = new String("Java no Senac");
		//		String b = a;

		if (a == b) {
			System.out.println("a e b sao iguais");
		} else {
			System.out.println("a e b sao diferentes");
		}

		int i = 6;
		int j = 6;

		if (i == j) {
			System.out.println("i e j sao iguais");
		} else {
			System.out.println("i e j sao diferentes");
		}

		if (a.equals(b)) {
			System.out.println("a e b sao iguais");
		} else {
			System.out.println("a e b sao diferentes");
		}


	}

}
