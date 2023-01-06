package br.com.treinamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
public static void main(String[] args) {
	Curso javaColecoes = new Curso("Dominando as coleções do Java","Arian Botine");
	
	//Não é possível manipular a lista, apenas percorrer
	List<Aula> aulasImutaveis = javaColecoes.getAulas();
	
	javaColecoes.adicionaAula(new Aula("Trabalhando com coleções",20));
	javaColecoes.adicionaAula(new Aula("Trabalhando com coleções",15));
	javaColecoes.adicionaAula(new Aula("Trabalhando com coleções",10));
	
	System.out.println(aulasImutaveis.toString());
	
	List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
	
	Collections.sort(aulas);
	
	System.out.println(javaColecoes.getTempoTotal());
	
	System.out.println(javaColecoes.toString());
}
}
