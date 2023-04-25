import java.util.Scanner;
public class CalculoCombustivel {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double valor;
		int dist, consu;
		String OP = null;
		
		System.out.println("Digite a distancia a ser pecorrida: ");
		dist = sc.nextInt();
		
		System.out.println("---------------------------");
		
		System.out.println("Digite qual o consumo medio do seu veiculo:");
		consu = sc.nextInt();
		
		System.out.println("---------------------------");
		
		System.out.println("Digite qual tipo de combustivel, gasolina (G) ou alcool (A): ");
		OP = sc.next();
		
		System.out.println("---------------------------");
		
		System.out.println("Digite o valor do combustivel:");
		valor = sc.nextDouble();
		
		switch (OP) {
		
		case "G": 
			double calculo = valor / consu;		
		System.out.println("Será gasto por litro:"+calculo);
		System.out.println("---------------------------");
		double calculo2 = dist * calculo;
		System.out.println("Para chegar até o destino abasteça esse valor: " + calculo2);
		break;
		
		case "A": 
			double calculo3 = valor / consu;
			System.out.println("Será gastro Por litro"+ calculo3);
			System.out.println("---------------------------");
			double calculo4 = dist * calculo3;
			System.out.println("Para chegar até seu destino abasteça com alcool" + calculo4);
			break;
		
		default: 
			System.out.println("Não existe um combustivél correspondente ao digitado.");
		
		}

		
		
		
		
		
		
	}

}
