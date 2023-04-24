import java.util.Scanner;
public class Mostrar4NumerosEImprimirArrays {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		int A [] = new int [5];
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe um valor: ");
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Posição	[" + i + "]" + A[i]);
		}
		
		sc.close();

	}

}
