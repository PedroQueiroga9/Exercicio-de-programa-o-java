package application;

import java.util.Scanner;

public class MaiorOuMenor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um valor: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro valor:");
		num2 = sc.nextInt();
		
		if (num1 >num2) {
			System.out.printf("%d é maior que %d", num1, num2);
		}

		else {
			System.out.printf("O %d é maior que %d", num2, num1);
		}
	}

}
