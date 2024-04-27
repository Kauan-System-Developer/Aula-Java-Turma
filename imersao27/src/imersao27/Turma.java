package imersao27;

import java.util.ArrayList;


public class Turma {
	
		private String nome;
		private Professor professor;
		private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	
		public Turma(String turma) {
			
			this.nome = turma;
			
		}
		
		public String getNome() {
			return nome;
		}
		
		
		public void setNome(String nome) {
			this.nome = nome;
			
		}
		
		public void addProfessor(Professor professor) {
			this.professor = professor;
		}
		
		public void addAluno(Aluno aluno) {
			this.listaAlunos.add(aluno);
		}
		
		public void visualizarTurma() {
			System.out.println("turma: " + this.nome);
			System.out.println("Professor: Vanderlei");
			System.out.println("Alunos:");
			for (Aluno aluno : listaAlunos) {
				System.out.println("nome: " + aluno.getNome() + ", idade: " + aluno.getIdade() + ", nota: " + aluno.getNota());
			}
		}
}

