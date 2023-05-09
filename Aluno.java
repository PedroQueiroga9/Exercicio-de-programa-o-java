import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String aluno;
	private int idade;
	private String faculdade;
	
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [aluno=" + aluno + ", media()=" + media() + ", situacaoaluno()=" + situacaoaluno() + "]";
	}
	
	public double media() {	
		double somanotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
		 somanotas += disciplina.getNota();
		}
		return somanotas / disciplinas.size();
	}
	
	public String situacaoaluno() {
		String situacao;
		if(media() < 70 ) {
			situacao = "aprovado";
		}
		else { 
			situacao = "Reprovado";
		}
		return situacao;
	}
	

}
