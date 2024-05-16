package bibliotecas;

public class TesteString3 {
	public static void main(String[] args) {
		String a = "Java no Senac";
		System.out.println(a);
		char c = a.charAt(9); //zero base
		System.out.println(c);
		int i = a.length(); //nzero base
		System.out.println(i);
		String n = a.substring(8); //zero base
		System.out.println(n);
		String m = a.trim(); //zero base
		System.out.println(m);
		int j = a.indexOf("S"); //zero base
		System.out.println(j);
		int k = a.indexOf("s"); //zero base
		System.out.println(k);
		int p = a.lastIndexOf("a"); //zero base
		System.out.println(p);
		
		
	}

}
