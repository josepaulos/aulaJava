package sistemabancario;

public class Cliente implements AcessoInterno{
	String nome;
	String sobreNome;
	String cpf;
	int senha; //this.senha que vai ser preenchida com a senha cript. do banco de dados

	@Override
	public boolean verificaSenha(int senha) { //senha digitada no navegador
		// TODO Auto-generated method stub
		return false;
	}
}