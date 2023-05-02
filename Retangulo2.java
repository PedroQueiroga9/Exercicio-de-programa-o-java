import java.util.Scanner;
public class Retangulo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		Retangulo r = new Retangulo();
		System.out.println("Informe a largura: ");
		r.width = sc.nextDouble();
		
		System.out.println("Informe a aultura: ");
		r.height = sc.nextDouble();
		
		double valorarea = r.area();
		System.out.println("O valor da area "+ valorarea);
		System.out.println("O valor do perimetro: "+ r.perimetro());
		System.out.println("O valor da diagonal: "+ String.format("%.2f", r.diagonal()));
		
	}



	
}
