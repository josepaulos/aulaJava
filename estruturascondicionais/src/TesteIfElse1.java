
public class TesteIfElse1 {

	public static void main(String[] args) {
		int a =1;
		int b = 2;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		if (a==b) {
			System.out.println("a é igual a b");
		}else {
			System.out.println("a é diferente de b");
		}
		if (a != b) {
			System.out.println("a é diferente de b ");
		}
		a = b;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		if (a==b) {
			System.out.println("a é igual a b");
		}else {
			System.out.println("a é diferente de b ");
		}

	}

}
