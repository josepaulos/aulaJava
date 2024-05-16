package colecoes;

import java.util.HashMap;
import java.util.Map;

import sistemabancario.Conta;

public class TestaMap {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.depositar(10);
		Conta c2 = new Conta();
		c2.depositar(20);
		Conta c3 = new Conta();
		c3.depositar(30);
		
		Map<String, Conta> mapaContas = new HashMap<String, Conta>();
		mapaContas.put("1234", c1);
		mapaContas.put("4567", c2);
		mapaContas.put("4433", c3);
		
		Conta contaRecuperada = mapaContas.get("1234");
		System.out.println(contaRecuperada.saldo);
	}
}











