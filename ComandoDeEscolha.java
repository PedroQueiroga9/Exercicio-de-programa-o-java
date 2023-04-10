import java.util.Scanner;

public class ComandoDeEscolha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe o sexo: ");
		String sexo = sc.next().toUpperCase();
		
		switch (sexo) {
		case "M":
			System.out.println("Masculino ");
			
		break;
		case "F": {
			System.out.println("Feminino ");
		}

		default:
			System.out.println("Sexo Invalido ");
			break;
		}
		sc.close();
	}

}
