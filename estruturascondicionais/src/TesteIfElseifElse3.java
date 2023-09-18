
public class TesteIfElseifElse3 {

	public static void main(String[] args) {
		double salario = 4900;
		System.out.println("Salario Bruto ="+salario);
		if (salario <2826.66) {
			System.out.println("não tem imposto ");
		}else if ( salario <= 3751.05) {
			double result =((salario*0.15)-354.80); 
			System.out.println("o imposto é 1= "+result);
			System.out.println("o salario liquido é ="+(salario-result));
		} else if(salario > 3751.05 && salario < 4664.68 ) {
			double result=((salario*0.22)-636.13);
			System.out.println("o imposto é 2= "+result);
			System.out.println("o salario liquido é ="+(salario-result));
		}else if(salario > 4664.68) {
			double result=((salario*0.27)-869.36);
			System.out.println("o imposto é 3= "+result);
			System.out.println("o salario liquido é ="+(salario-result));
		}
	}
}
