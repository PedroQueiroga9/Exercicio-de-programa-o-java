
import java.util.Scanner;
public class Combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a idade de João: ");
		int joao = sc.nextInt();
		System.out.println("Informe a idade de jose: ");
		int jose = sc.nextInt();
		System.out.println("Informe a idade de Maria");
		int maria = sc.nextInt();
		if ((joao < jose) && (joao < maria)) {
			System.out.println("Joao é o caçula");	
		}
		else if ((jose < joao )&& (jose < maria)); {
			System.out.println("José é o caçula");	
		}
		else {
			System.out.println("Maria é a caçula");
		}
		sc.close();
	}

}
