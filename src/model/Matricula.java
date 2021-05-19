package model;

public class Matricula {

	private int codigoMatricula;
	private Disciplina codigoDisciplina;
	private Aluno codigoAluno;
	
	public Matricula(int codigoMatricula, Disciplina codigoDisciplina, Aluno codigoAluno) {
		super();
		this.codigoMatricula = codigoMatricula;
		this.codigoDisciplina = codigoDisciplina;
		this.codigoAluno = codigoAluno;
	}

	public int getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(int codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public Disciplina getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(Disciplina codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public Aluno getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(Aluno codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	
	

}
