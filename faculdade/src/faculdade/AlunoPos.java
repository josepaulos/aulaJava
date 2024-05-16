package faculdade;

import java.util.ArrayList;
import java.util.List;

public class AlunoPos extends Aluno {
private List<Disciplina> disciplinasCursar = new ArrayList<>();
	
	public void cursar(Disciplina disciplina) {
		disciplinasCursar.add(disciplina);
        System.out.println(getNome() + " se inscreveu para cursar na disciplina: " + disciplina.getNome());
    }
	
	
	public void tcc() {
		System.out.println("Trabalho de Conclusão de Curso no fim dos 6 módulos");
	}
	public void duracao() {
		System.out.println("O aluno de pós faz seu curso em 6 módulos de 2 meses cada");
		
	}

}
