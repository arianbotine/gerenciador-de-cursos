package br.com.treinamento;

import java.util.List;

public class TestaCurso {
public static void main(String[] args) {
	Curso javaColecoes = new Curso("Dominando as coleções do Java","Arian Botine");
	
	//Não é possível manipular a lista, apenas percorrer
	List<Aula> aulas = javaColecoes.getAulas();
	
	javaColecoes.adicionaAula(new Aula("Trabalhando com coleções",20));
	javaColecoes.adicionaAula(new Aula("Trabalhando com coleções",15));
	javaColecoes.adicionaAula(new Aula("Trabalhando com coleções",10));
	
	System.out.println(aulas.toString());
}
}
