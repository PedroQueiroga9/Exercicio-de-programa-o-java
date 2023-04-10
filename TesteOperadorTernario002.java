import java.util.Scanner;

public class TesteOperadorTernario002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();

		int soma = num1 + num2;
		
		int valor = (soma >= 20) ? soma + 10 : soma - 5;
		System.out.println("O resultado será " + valor);
		
		sc.close();

	}

}
