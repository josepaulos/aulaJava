package faculdade;

import java.util.ArrayList;
import java.util.List;

public class AlunoGrad extends Aluno {
	
private List<Disciplina> disciplinasCursar = new ArrayList<>();
	
	public void cursar(Disciplina disciplina) {
		disciplinasCursar.add(disciplina);
        System.out.println(getNome() + " se inscreveu para cursar na disciplina: " + disciplina.getNome());
    }
	
	public void projetoIntegrador() {
		System.out.println("Projeto Integrador desenvolvido ao longo dos 5 semestres");
		
	}
	public void duracao() {
		System.out.println("O aluno de graduação faz seu curso ao longo de 5 semestres");
		
	}
	

}
