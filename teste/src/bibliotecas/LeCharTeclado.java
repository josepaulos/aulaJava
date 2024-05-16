package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in; //InputStream sabe capturar um byte
//		System.out.println(is);
		//nesse caso recebendo-o da entrada parão do sistema
		InputStreamReader isr = new InputStreamReader(is);
//		System.out.println(isr);
		//InputStreamReader sabe receber um byte e transforma-lo em char
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Você digitou a tecla: "+c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}