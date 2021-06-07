package br.com.learn;

public class Aluno {
	public String nomeAluno;
	public int numeroMatricula;

	public Aluno(String nomeAluno, int numeroMatricula) {
		if(nomeAluno == null) {
			throw new NullPointerException("nome nao pode ser null");
		}
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
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nomeAluno.equals(outro.nomeAluno);
	}
	
	@Override
	public int hashCode() {
		return this.nomeAluno.hashCode();
	}

	@Override
	public String toString() {
		return "[Nome do aluno: " + this.getNomeAluno() + ". Matrícula: " + this.getMatricula();
	}
}
