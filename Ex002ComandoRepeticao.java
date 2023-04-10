
public class Ex002ComandoRepeticao {

	public static void main(String[] args) {
		
		int valor = 1, contadorPar=0;
		
		while(valor<= 5) {
			if(valor % 2 == 0) {
				System.out.println(valor +  " É par");
				contadorPar = contadorPar + 1;
				
			}
			valor++;
		}
		System.out.println("Qtde De Pares : " + contadorPar);
		
		
		
		
		
		
		
		
	}

}
