public class TesteDoWhile2 {

	public static void main(String[] args) {
		int multiplicador=1;
		int numero=2;
		do {
			if (numero<10) {
				System.out.println("numero ="+numero);
				System.out.println("multiplicador = "+multiplicador);
				System.out.println("Taboada = "+numero+" x " +multiplicador+" = "+numero*multiplicador);
				multiplicador++;
			}else {
				System.out.println("numero maior que 10");
				break;
			}
			
			
			
		} while (multiplicador<=10);
		
	}

}
