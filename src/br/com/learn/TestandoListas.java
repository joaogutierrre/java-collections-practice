package br.com.learn;

import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {
		
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";
        
        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        
        System.out.println(cursos);
        cursos.remove(2);
        System.out.println(cursos);
        
        System.out.println("Cursos em promoção: " + cursos.get(1));

	}
}
