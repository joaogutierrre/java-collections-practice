package br.com.learn;
import java.util.*;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
        
		/*Acessando o próprio método getters para inserir itens na lista - *DEPRECATED*.
        
        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.getAulas().add(new Aula("Listas de Objetos", 20));
        javaColecoes.getAulas().add(new Aula("Relacionamentos com coleções", 25));
        
        System.out.println(aulas);*/
       
        //Inserindo itens na lista à partir de um método específico para isto.
      
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Listas de Objetos, 20", 20));
        javaColecoes.adiciona(new Aula("Relacionamentos com coleções", 25));
        
        System.out.println(javaColecoes.getAulas());
	}
}
