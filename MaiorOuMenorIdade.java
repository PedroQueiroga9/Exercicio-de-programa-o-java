package application;

import java.util.Scanner;

public class MaiorOuMenorIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade para verificação: ");
		int idade = sc.nextInt();
		int calculo = idade - 18;
		if (idade >= 18) {
			System.out.println("Voce é maior de idade, passou na verificação.");
		}

		
		else {
			
			System.out.printf("falta apenas %d ano(s) para sua incrição volte mais tarde.%n", calculo );
		
		}
	}

}
