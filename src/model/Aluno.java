package model;

public class Aluno extends Pessoa{

	private int codigoAluno;

	public Aluno(String nome, String cpf, int codigoAluno) {
		super(nome, cpf);
		this.codigoAluno = codigoAluno;
	}

	public int getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	
}
