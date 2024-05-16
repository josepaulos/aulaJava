package sistemabancario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Clayton";
		f1.salario = 500.0;
		f1.status = "ativo";
		System.out.println("Salario: "+f1.salario);
		f1.getBonus();
		System.out.println("Salário com bonus: "+f1.salario);
	}

}
