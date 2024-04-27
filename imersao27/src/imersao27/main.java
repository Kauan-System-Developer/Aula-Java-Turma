package imersao27;

public class main {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("pedro", 20);
		aluno.setNota(8.5);
		Aluno aluno2 = new Aluno("joão", 21);
		aluno.setNota(9.0);
		Aluno aluno3 = new Aluno("maria", 22);
		aluno.setNota(7.5);
		
		Professor professor = new Professor("Vaderlei", 40, 20000);
		Turma turma = new Turma("turma do pagode");
		
		turma.addAluno(aluno);
		turma.addAluno(aluno2);
		turma.addAluno(aluno3);
	
		turma.addProfessor(professor);
		
		turma.visualizarTurma();
	}
}
