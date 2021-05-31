package br.com.learn;
import java.util.*;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        
		List<Aula> aulas = javaColecoes.getAulas();
        
		System.out.println(aulas);
        
        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.getAulas().add(new Aula("Listas de Objetos", 20));
        javaColecoes.getAulas().add(new Aula("Relacionamentos com coleções", 25));
        
        System.out.println(aulas);
	}
}
