import java.util.Scanner;

public class ValidaFibonacci {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		while (num2 < num) {
			int aux = num2;
			num2 = num1 + num2;
			num1 = aux;
		}
		
		if (num == num2 || num == num1) {
			System.out.println("O número " + num + " pertence à sequência de Fibonacci!");
		} else { 
			System.out.println("O número " + num + " não pertence à sequência de Fibonacci!");
		}
		
		sc.close();
		
	}
}
