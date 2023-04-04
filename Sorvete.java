import java.util.Scanner;

public class Sorvete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o sabor M para morango ");
		System.out.println("Informe C para chocolate: ");
		String sabor = sc.next();
		System.out.println("Qtd de Bolas ");
		int qtdbolas = sc.nextInt();
		
		
		if (sabor.equalsIgnoreCase("C")) {
		System.out.println("Desconto de 10% ");
		}

		else if (sabor.equalsIgnoreCase("M")) {
			System.out.println("Sem desconto.");
			
		}
		else {
			System.out.println("Sabor invalido. ");
		}
	}
	

}
