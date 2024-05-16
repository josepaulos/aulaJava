package java_avc;

public class EstrInterrupt {
	public static void main(String[] args) {
		String names[] = {"Breno", "Bianca", "Bernardo", "Carlos"};
		
		String searchName = "Clayton";
		
		boolean foundName = false;
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(searchName)) {
				foundName = true;
				break;
			}
		}
		if (foundName) {
			System.out.println(searchName + " encontrado");
		} else {
			System.out.println(searchName + " não foi encontrado");
		}
	}

}
