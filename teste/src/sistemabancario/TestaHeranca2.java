package sistemabancario;

public class TestaHeranca2 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		double salFuncionario = f1.getSalario();
		System.out.println("O salário do funcionario é:"+salFuncionario);
		System.out.println("O bonus do funcionário é: "+f1.getBonus());
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
		System.out.println("O salário do gerente é:"+g2.getSalario());
		System.out.println("O bonus do gerente é: "+g2.getBonus());
		
	}

}
