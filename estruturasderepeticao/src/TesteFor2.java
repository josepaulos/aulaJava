public class TesteFor2 {

	public static void main(String[] args) {
		int multiplicador=1;
		int contador;
		
		
		for (contador = 1; contador <= 9; contador++) {
			int numero = 11;
			if (numero<10) {
				multiplicador++;
				System.out.println("numero ="+numero);
				System.out.println("multiplicador = "+multiplicador);
				System.out.println("Taboada = "+numero+" x " +multiplicador+" = "+numero*multiplicador);
			}else {
				System.out.println("numero maior que 10");
				break;
			}
			
			
		}

	}

}