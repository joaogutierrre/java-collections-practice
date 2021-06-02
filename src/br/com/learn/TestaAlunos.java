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
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}
}
