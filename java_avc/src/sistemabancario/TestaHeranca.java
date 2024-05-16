package sistemabancario;

public class TestaHeranca {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		double salFuncionario = f1.getSalario();
		System.out.println("O salário do funcionario é:"+salFuncionario);
		System.out.println("O bonus do funcionário é: "+f1.getBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("O salário do gerente é:"+g1.getSalario());
		System.out.println("O bonus do gerente é: "+f1.getBonus());
		
	}

}
