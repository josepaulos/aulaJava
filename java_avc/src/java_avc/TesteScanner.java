package java_avc;

import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String name = sc.next();
		System.out.println("Olá "+name+"!");

	}

}
