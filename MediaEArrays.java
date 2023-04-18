import java.util.Scanner;

public class MediaEArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int [] num = new int [4];
		int soma = 0;
		
		
	
		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe uma nota: ");
			num[i] = sc.nextInt();
			soma = soma + num[i];
		}
		
		double media = soma / 4;
		System.out.println("A média é:  " + media );
		
		if (media <= 6) {
			System.out.println("Voce foi reprovado.");
		}
		
		else if (media >= 8) {
			System.out.println("Voce foi muito bem");
		}
		
		
		

	}

}
