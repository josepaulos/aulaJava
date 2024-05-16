package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestaSet2 {
	public static void main(String[] args) {
		Set<String> objetos = new HashSet<String>();
		objetos.add("SQL");
		objetos.add("Python");
		objetos.add("C#");
		objetos.add("C++");
		System.out.println(objetos);
		
		for (Object object : objetos) {
			System.out.println(object);
		}
		
	}

}
