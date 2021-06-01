package br.com.learn;
import java.util.*;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//List<Aula> aulas = javaColecoes.getAulas();
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	    javaColecoes.adiciona(new Aula("Listas de Objetos", 20));
	    javaColecoes.adiciona(new Aula("Relacionamentos com coleções", 25));
	    
	    System.out.println(javaColecoes.getAulas());
	    
	    List<Aula> aulasImutaveis = javaColecoes.getAulas();
	    
	    List<Aula> aulas = new ArrayList<>(aulasImutaveis);
	    
	    Collections.sort(aulas);
	    System.out.println(aulas);
	    
	    
	}
	
}
