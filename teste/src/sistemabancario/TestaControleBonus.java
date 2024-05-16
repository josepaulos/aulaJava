package sistemabancario;

public class TestaControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		controle.setTotalBonus(f1);
		System.out.println("Bônus pagos até agora: "+controle.getTotalBonus());
	
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
//		controle.setTotalBonus(g2);
		System.out.println("Bônus pagos até agora: "+controle.getTotalBonus());
	
	}

}
