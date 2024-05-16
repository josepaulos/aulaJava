package faculdade;

public class TesteFaculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Teste diciplina
		Disciplina programacao = new Disciplina();
		programacao.setNome("Programação");
		programacao.setCargaHoraria(100);
		Disciplina bancodedados = new Disciplina();
		bancodedados.setNome("Banco de Dados");
		bancodedados.setCargaHoraria(100);
		System.out.println("Matérias");
		System.out.println(programacao.getNome());
		System.out.println(programacao.getCargaHoraria());
		System.out.println(bancodedados.getNome());
		System.out.println(bancodedados.getCargaHoraria());
		
		System.out.println("-----------------------------------------");
		  System.out.println("Aluno de Graduação");
		AlunoGrad jose= new AlunoGrad();
//		Teste do aluno
		
		jose.setNome("José");
		jose.setCpf("11111111");
		jose.setMatricula("2222222");
		jose.setTelefone("4002-8922");
		jose.setEmail("jose@gmail.com");
		jose.setEndereco("Rua 1");
		
		
		System.out.println("Aluno:");
		System.out.println("Nome: " + jose.getNome());
        System.out.println("CPF: " + jose.getCpf());
        System.out.println("Matrícula: " + jose.getMatricula());
        System.out.println("Telefone: " + jose.getTelefone());
        System.out.println("Email: " + jose.getEmail());
        System.out.println("Endereço: " + jose.getEndereco());
        jose.cursar(programacao);
        jose.solicitarBoleto();
        jose.historico();
        jose.projetoIntegrador();
        jose.duracao();
        
        System.out.println("Aluno de pos");
        AlunoPos paulo= new AlunoPos();

		
		paulo.setNome("Paulo");
		paulo.setCpf("55555555");
		paulo.setMatricula("66666666");
		paulo.setTelefone("4002-8922");
		paulo.setEmail("Paulo@gmail.com");
		paulo.setEndereco("Rua 7");
		
		
		
		System.out.println("Aluno:");
		System.out.println("Nome: " + paulo.getNome());
        System.out.println("CPF: " + paulo.getCpf());
        System.out.println("Matrícula: " + paulo.getMatricula());
        System.out.println("Telefone: " + paulo.getTelefone());
        System.out.println("Email: " + paulo.getEmail());
        System.out.println("Endereço: " + paulo.getEndereco());
        paulo.cursar(bancodedados);
        paulo.solicitarBoleto();
        paulo.historico();
        paulo.tcc();
        paulo.duracao();
        
        
        System.out.println("-----------------------------------------");
        
//        teste Prof
        Professor clayton = new Professor();
        
        clayton.setNome("Clayton");
        clayton.setCpf("22222222");
        clayton.setMatricula("3333333");
        clayton.setTelefone("4002-8922");
        clayton.setEmail("Clayton@gmail.com");
        clayton.setEndereco("Rua2");
        
        
        System.out.println("Professor:");
        System.out.println("Nome: " + clayton.getNome());
        System.out.println("CPF: " + clayton.getCpf());
        System.out.println("Matrícula: " + clayton.getMatricula());
        System.out.println("Telefone: " + clayton.getTelefone());
        System.out.println("Email: " + clayton.getEmail());
        System.out.println("Endereço: " + clayton.getEndereco());
        clayton.lecionar(programacao);
        
        

	}

}
