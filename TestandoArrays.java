import java.util.Scanner;

public class TestandoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int [] num = new int [4];
		
		
	
		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe uma nota: ");
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("As notas digitadas foram: " + num[i]);
		}
		

	}

}
