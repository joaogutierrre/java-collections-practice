package br.com.learn;
import java.util.*;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	    javaColecoes.adiciona(new Aula("Listas de Objetos", 20));
	    javaColecoes.adiciona(new Aula("Relacionamentos com coleções", 25));
	    
	    
	    /*Old way to display courses & classes lists
	     * 
	     * List<Aula> aulasImutaveis = javaColecoes.getAulas();
	    List<Aula> aulas = new ArrayList<>(aulasImutaveis);
	    int tempo = javaColecoes.getTempoTotal();
	    String nome = javaColecoes.getNome();
	    Collections.sort(aulas);
	    
	    System.out.println("Curso: " + nome + ". Tempo total: " + tempo +" hrs.");
	    System.out.println(aulas);*/
	    
	    
	    /*New way to display courses & classes lists"/
	     * 
	     */
	    
	    String cursoAulas = javaColecoes.toString();
	    System.out.println(cursoAulas);
	}
	
}
