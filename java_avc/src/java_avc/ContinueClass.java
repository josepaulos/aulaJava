package java_avc;

public class ContinueClass {
	public static void main(String[] args) {
		String names[] = {"Diogo", "Erick", "Gabriel", "Erick"};
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if(!names[i].equals("Erick")) {
				continue;
			}
			count++;
		}
		
		System.out.println(count + " Ericks encontrados na lista");
	}
	

}
