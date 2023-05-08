package Pessoa;

import javax.swing.JOptionPane;

public class Pessoa {

	public String nome;
	public String Sobrenome;
	public int IdadeNascimento;
	
	public String juntaNome() {
		
		return this.nome + " " + this.Sobrenome;
	}
	public void idadePessoa() {
		int idade = 2023 - this.IdadeNascimento;
		JOptionPane.showMessageDialog(null, "Idade de " + juntaNome() + " " + idade );
		
	}
	
	
	
}
