package java_avc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteIO {
	public static void main(String[] args) {
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		System.out.println("Digite seu nome: ");
		try {
			name = dataIn.readLine();
		} catch (IOException e) {
			System.out.println("Erro!");
		}
		System.out.println("Olá "+name+"!");
	}

}
