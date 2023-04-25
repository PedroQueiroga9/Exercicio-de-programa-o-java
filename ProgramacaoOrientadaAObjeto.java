import java.util.Scanner;
public class ProgramacaoOrientadaAObjeto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	Triangulo x, y;
	x = new Triangulo ();
	y = new Triangulo ();
	
	System.out.println("Insira os valores do triangulo X:");
	x.a = sc.nextInt();
	x.b = sc.nextInt();
	x.c = sc.nextInt();
	
	System.out.println("Insira os valores do triangulo Y:");
	y.a = sc.nextInt();
	y.b = sc.nextInt();
	y.c = sc.nextInt();
	
	double s1, s2;
	s1 = (x.a + x.b + x.c);
	s2 = (y.a + y.b + y.c);
	
	double f1, f2;
	f1 = (s1 - x.a) * (s1 - x.b) * (s1 - x.c);
	f2 = (s2 - y.a) * (s2 - y.b) * (s2 - y.c);
	
	double r1, r2;
	r1 = Math.sqrt(f1);
	r2 = Math.sqrt(f2);
	
	System.out.println("O resultado do triangulo x é: "+ r1);
	System.out.println("O resultado do triangulo y é: "+ r2);
	
	if (r1 >= r2) {
		System.out.println("O triangulo X é maior que o triangulo y.");
	}
	
	else {
		System.out.println("O triangulo Y é maior que o Triangulo X");
	}
		
		
		sc.close();
	}

}
