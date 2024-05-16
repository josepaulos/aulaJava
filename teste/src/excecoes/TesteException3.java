package excecoes;

import java.io.FileNotFoundException;

public class TesteException3 {
	public static void main(String[] args) {
		try {
			new java.io.FileReader("nomesDosUsuarios.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
