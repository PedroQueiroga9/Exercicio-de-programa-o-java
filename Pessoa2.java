package Pessoa;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pessoa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Pessoa P = new Pessoa();
		
		
		P.nome = JOptionPane.showInputDialog("Informe seu nome: ");
		
		P.Sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
		
		P.IdadeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe a data de nascimento"));
		
		JOptionPane.showMessageDialog(null, "Nome completo: " + P.juntaNome());
		P.idadePessoa();
		
		

	}

}
