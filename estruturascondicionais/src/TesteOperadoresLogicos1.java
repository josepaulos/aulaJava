
public class TesteOperadoresLogicos1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		char c = 'z';
		char d = 'k';
		boolean e = true;
		boolean f = true;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		System.out.println("a é maior que b E b maior que 1 ="+( a > b && b > 1));
		System.out.println("c é maior que d E d maior que A ="+( c > d && d > 'A'));
		System.out.println("a é igual a b ou b menor que 5 ="+( a == b || b < 5));
		System.out.println("c é igual a d ou d menor que w ="+( c == d || d < 'w'));
		System.out.println("e OU EXCLUSIVO  f ="+( e ^ f));
		System.out.println("NOT e ="+(!e));
	}

}
