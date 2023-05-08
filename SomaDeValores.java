package Interface;

import javax.swing.JOptionPane;

public class SomaDeValores {

	public static void main(String[] args) {
		
	String valor1 = JOptionPane.showInputDialog("Digite um número");
	int n1 = Integer.parseInt(valor1);
	
	String valor2 = JOptionPane.showInputDialog("Digite outro valor: ");
	int n2 = Integer.parseInt(valor2);
	
	int result = n1 + n2;
	
	 JOptionPane.showMessageDialog(null, "O valor da soma:" + result);

	}

}
