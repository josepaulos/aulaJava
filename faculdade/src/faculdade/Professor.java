package faculdade;

import java.util.ArrayList;
import java.util.List;

public  class Professor extends Pessoa {
	private List<Disciplina> disciplinasMinistradas = new ArrayList<>();
	
	public void lecionar(Disciplina disciplina) {
        disciplinasMinistradas.add(disciplina);
        System.out.println(getNome() + " se inscreveu para lecionar na disciplina: " + disciplina.getNome());
    }
	

}
