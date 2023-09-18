public class TesteWhile2 {

	public static void main(String[] args) {
		int multiplicador=1;
		while (multiplicador<=9) {
			int numero = 2;
			if (numero<10) {
				System.out.println("numero ="+numero);
				System.out.println("multiplicador = "+multiplicador);
				System.out.println("Taboada = "+numero+" x " +multiplicador+" = "+numero*multiplicador);
				multiplicador++;
			}else {
				System.out.println("numero maior que 10");
				break;
			}
			
		}

	}

}