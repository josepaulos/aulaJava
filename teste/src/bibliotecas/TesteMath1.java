package bibliotecas;

//Criem 3 novas classes TesteMath2, 3 e 4 para mostrar o
//funcionamento dos métodos:
//TesteMath2: random, max, min, ceil, floor
//TesteMath3: exp, log, pow, round, sqrt
//TesteMath4: sin, toDegrees, toRadians

public class TesteMath1 {
	public static void main(String[] args) {
		int i  = -10;
		int j = -20;
		System.out.println(i);
		int k = Math.abs(i);
		System.out.println(k);
		System.out.println(Math.abs(j));
		
		double d1 = 4.5;
		System.out.println(d1);
		double d2 = Math.round(d1);
		System.out.println(d2);
		System.out.println(Math.round(d1));
	}

}
