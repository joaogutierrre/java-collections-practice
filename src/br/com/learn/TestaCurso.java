package br.com.learn;
import java.util.*;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
        
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
        
		/*Acessando o pr�prio m�todo getters para inserir itens na lista - *DEPRECATED*.
        
        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.getAulas().add(new Aula("Listas de Objetos", 20));
        javaColecoes.getAulas().add(new Aula("Relacionamentos com cole��es", 25));
        
        System.out.println(aulas);*/
       
        //Inserindo itens na lista � partir de um m�todo espec�fico para isto.
      
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Listas de Objetos, 20", 20));
        javaColecoes.adiciona(new Aula("Relacionamentos com cole��es", 25));
        
        System.out.println(javaColecoes.getAulas());
	}
}
