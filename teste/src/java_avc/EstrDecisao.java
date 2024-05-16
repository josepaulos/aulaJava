package java_avc;

public class EstrDecisao {
	public static void main(String[] args) {
		int grade = 92;
		if(grade >=90) {
			System.out.println("Ótimo");
		} else if ((grade<90) && (grade >=70)){
			System.out.println("Bom");
		} else if ((grade<70) && (grade >=50)){
			System.out.println("Suficiente");
		} else {
			System.out.println("Insuficiente");
		}
//		System.out.println("Após o if");
	}

}
