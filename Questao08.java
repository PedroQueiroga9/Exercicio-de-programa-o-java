import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int valor1 = sc.nextInt();
		
		if (valor1 > 100) {
			if (valor1 < 200) {
				System.out.println("Est� No Intervalo");
			
			}
			else {
				System.out.println("Est� fora do intervalo");
			}	
		}
		else {
			System.out.println("Est� fora do intervalo");
		}

	}

}
