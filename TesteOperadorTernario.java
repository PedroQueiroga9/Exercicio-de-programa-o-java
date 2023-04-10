import java.util.Scanner;
public class TesteOperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um valor: ");
		int numero = sc.nextInt();
		String resultado = (numero % 2 == 0) ? "Par" : "Impar";
		System.out.println(resultado);
		sc.close();
	}

}
