
public class TesteIfElseifElse2 {

	public static void main(String[] args) {
		double salario = 3900;
		System.out.println("Salario ="+salario);
		if (salario <2826.66) {
			System.out.println("não tem imposto ");
		}else if ( salario <= 3751.05) {
			System.out.println("o imposto é 1 "+((salario*0.15)-354.80));
		} else if(salario > 3751.05 && salario < 4664.68 ) {
			System.out.println("o imposto é 2 "+((salario*0.22)-636.13));
		}else if(salario > 4664.68) {
			System.out.println("o imposto é 3 "+((salario*0.27)-869.36));
		}
		
		
		
		
	}

}
