package imersao27;


public class Aluno extends Pessoa{
	
	private double nota;
	
	public Aluno(String nome, int idade, double nota) {
		super(nome, idade);
		this.nota = nota;
	}
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}


	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	

}
