package sistemabancario;

public class TestaControleSalarial {
	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		controle.setTotalSalarios(f1);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(2000);
		controle.setTotalSalarios(f2);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
//		controle.setTotalSalarios(g2);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
	}

}
