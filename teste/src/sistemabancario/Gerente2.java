package sistemabancario;

public class Gerente2 extends Funcionario2 implements AcessoInterno {
	int senha; //this.senha que vai ser preenchida com a senha cript. do banco de dados
	
//	double getBonus() {
//		return super.getBonus() + 5000;
//	}
	
	public boolean verificaSenha(int senha) { //senha digitada no navegador
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}

//	@Override
//	void verificaSenha() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public void validaSenha(FuncionarioEspecial funcEsp) {
//		// TODO Auto-generated method stub
//		
//	}
}