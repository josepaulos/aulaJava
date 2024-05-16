package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("escrita.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Java no Senac");
		bw.close();
		System.out.println("Escrita realizada com sucesso");
	}

}
