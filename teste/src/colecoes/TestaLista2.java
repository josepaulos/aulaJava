package colecoes;

import java.util.ArrayList;
import java.util.List;

import sistemabancario.Conta;

public class TestaLista2 {
	public static void main(String[] args) {
		List lista1 = new ArrayList();
		lista1.add("Java");
		lista1.add("C");
		lista1.add("Go");
		lista1.add("Rust");
		Conta c1 = new Conta();
		Conta c2= new Conta();
		Conta c3 = new Conta();
		
		c1.depositar(10);
		c1.nome = "Clayton";
		c2.depositar(20);
		c2.nome = "Bernardo";
		c3.depositar(30);
		c3.nome = "Guilherme";
		
		
//		List contas = new ArrayList();
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
//		contas.add("Clayton");
		
		System.out.println(contas);
		System.out.println(c1);
		
		for (int i = 0; i < contas.size(); i++) {
			Conta contaTemp = contas.get(i);
			System.out.println(contaTemp.saldo);
		}
		
		
		
		
		
	}

}
