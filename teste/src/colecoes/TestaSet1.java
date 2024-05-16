package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestaSet1 {
	public static void main(String[] args) {
		Set objetos = new HashSet();
		objetos.add("SQL");
		objetos.add("Python");
		objetos.add("C#");
		objetos.add("C++");
		System.out.println(objetos);
		
		for (Object object : objetos) {
			String sTemp = (String) object;
			System.out.println(sTemp);
		}
		
	}

}
