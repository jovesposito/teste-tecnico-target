import java.util.Scanner;

public class VerificaString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva uma palavra: ");
		String palavra = sc.nextLine().toLowerCase();
		
		int contador = 0;
		for (char letra : palavra.toCharArray()) {
			if (letra == 'a') {
				contador++;
			}
		}
		
		System.out.printf("A palavra '%s' contém %d ocorrências da letra 'a'.", palavra, contador);
		
		sc.close();
		
	}

}
