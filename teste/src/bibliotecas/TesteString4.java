package bibliotecas;

public class TesteString4 {
	public static void main(String[] args) {
		String a = "Gostei desta roda de samba";
		boolean q = a.isEmpty();
		System.out.println(q);
		boolean r = a.contains("desta2");
		System.out.println(r);
		a.replace("a", "o");
		System.out.println(a);
		String b = a.replace("a", "o");
		System.out.println(b);
	}

}
