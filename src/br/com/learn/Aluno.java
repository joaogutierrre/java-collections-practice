package br.com.learn;
import java.util.*;

public class Aluno {
	public String nomeAluno;
	public int numeroMatricula;
	private Set<Aluno> alunos = new HashSet<>();
	
	public Aluno(String nomeAluno, int numeroMatricula) {
		super();
		this.nomeAluno = nomeAluno;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNomeAluno() {
		return this.nomeAluno;
	}
	
	public int getMatricula() {
		return this.numeroMatricula;
	}
	
	public void adicionaAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome do aluno: " 
				+ this.getNomeAluno() + 
				". Matrícula: " + 
				this.getMatricula();
	}
}
