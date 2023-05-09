import java.util.Scanner;

public class AlunoPrincipal {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();
		Disciplina disciplina3 = new Disciplina();
	
		
		System.out.println("Insira o nome do aluno");
		aluno.setAluno(sc.next());
		System.out.println("Insira a idade do aluno: ");
		aluno.setIdade(sc.nextInt());
		System.out.println("insira a faculdade do aluno: ");
		aluno.setFaculdade(sc.next());
		
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(8);
		
		disciplina2.setDisciplina("Programação ");
		disciplina2.setNota(9);
		
		disciplina3.setDisciplina("Compiladores ");
		disciplina3.setNota(10);
		
		aluno.getDisciplinas().add(disciplina1);
		
	}

}
