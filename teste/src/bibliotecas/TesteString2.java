package bibliotecas;

public class TesteString2 {
	public static void main(String[] args) {
		String a = "Java no Senac";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		String c = "java no senac";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		System.out.println(j);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		a.toLowerCase();
		System.out.println(a);
		String d = a.toLowerCase();
		System.out.println(d);
		String e = a.toUpperCase();
		System.out.println(e);
	}

}
