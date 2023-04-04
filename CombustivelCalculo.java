import java.text.DecimalFormat;
import java.util.Scanner;
public class CombustivelCalculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o tipo do tipo de combustivel G ou A: ");
		String tipoCombustivel = sc.next();
		System.out.println("Qual a capacidade do seu tanque de combustivel? ");
		int ct = sc.nextInt();
		DecimalFormat df = new 
				DecimalFormat("##.00");
		if (tipoCombustivel.equalsIgnoreCase("G")) {
			double vg = ct * 5.86;
			System.out.println("O valor do tanque de gasolina é:" + df.format(vg));
		}
		else {
			double vg = ct * 5.08;
			System.out.println("O valor do tanque de alcool é" + df.format(vg));
			
		}	
		sc.close();
	}

}
