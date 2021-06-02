package br.com.learn;

import java.util.*;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Gustavo");
		alunos.add("Jonas");
		alunos.add("João");
		alunos.add("Arthur");
		alunos.add("Caio");
		alunos.add("Ariston");
		alunos.add("Bibiela");
		alunos.add("Sara");
		alunos.add("Rodrigo");
		alunos.add("G. Guskol");

		//display the set elements
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		//tryna add the same strings
		
		alunos.add("Bibiela");
		alunos.add("Sara");
		alunos.add("Rodrigo");
		alunos.add("G. Guskol");
		
		//display set size
		System.out.println(alunos.size());
		System.out.println("------------------");
		
		//try to add the same string element on the set
		boolean add = alunos.add("G. Guskol");
		System.out.println("G. Guskol foi add no set? " + add);
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}
}
