package br.com.learn;

public class Aluno {
	public String nomeAluno;
	public int numeroMatricula;

	public Aluno(String nomeAluno, int numeroMatricula) {
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNomeAluno() {
		return this.nomeAluno;
	}

	public int getMatricula() {
		return this.numeroMatricula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome do aluno: " + this.getNomeAluno() + ". Matrícula: " + this.getMatricula();
	}
}
