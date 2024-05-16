package sistemabancario;



public class ControleSI {
	int senha;
	
	void validaSenha(AcessoInterno acessoInterno) {
		acessoInterno.verificaSenha(0);
	}

}
