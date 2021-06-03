package br.com.learn;

import java.util.*;

public class Curso{
    private String nome;
    private String instrutor;
    private int tempoTotal;
    private List<Aula> aulas = new LinkedList<Aula>();
    

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getInstrutor(){
        return this.instrutor;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona (Aula aula) {
    	this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
    	return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "[Curso: "
    			+ this.getNome() +
    			". Tempo total: "
    			+ this.getTempoTotal() + 
    			". Aulas: " 
    			+ this.getAulas() ; 
    }

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		
	}
    
    
}