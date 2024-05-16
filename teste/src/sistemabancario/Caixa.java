package sistemabancario;

public class Caixa extends Funcionario2 implements AcessoInterno {
	int senha; //this.senha que vai ser preenchida com a senha cript. do banco de dados
	
	public boolean verificaSenha(int senha) { //senha digitada no navegador
		//método que verifica senha
		//implementacao diferente
		//da classe gerente
		return false;
	}

	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	void verificaSenha() {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void validaSenha(FuncionarioEspecial funcEsp) {
//		// TODO Auto-generated method stub
//		
//	}

}
