package sistemabancario;

public class Gerente extends Funcionario {
	int senha;
	
	double getBonus() {
		return this.salario * 0.15;
	}
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
}