
public class TesteAtribuicaoVariaveis2 {

	public static void main(String[] args) {
		// Definição de variaveis 
				boolean g = true;
				char c = '1';
				byte b = 0;
				short s = 1;
				int ii = 2;
				long l = 3;
				float ff = 4;
				double d = 5;
				//Exibição de variaveis 
				System.out.println("g="+g);
				System.out.println("c="+c);
				System.out.println("b="+b);
				System.out.println("s="+s);
				System.out.println("i="+ii);
				System.out.println("l="+l);
				System.out.println("f="+ff);
				System.out.println("d="+d);
//				conversão implicita
				int iii = 5;
				float j = 10.5f;
				j = iii;
				System.out.println(iii);
				System.out.println(j);
//				converção explicita
				float f = 5;
				int i = (int) f; // Exemplo de Casting
				System.out.println(f);
				System.out.println(i);
	}

}
