package br.com.learn;

import java.util.*;

public class Curso{
    private String nome;
    private String instrutor;
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
        return this.aulas;
    }
}