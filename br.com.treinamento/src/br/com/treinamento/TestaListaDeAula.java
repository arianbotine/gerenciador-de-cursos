package br.com.treinamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	public static void main(String[] args) {
		Aula aula1 = new Aula("Reordenando listas",30);
		Aula aula2 = new Aula("Aprendendo sobre lambdas",20);
		Aula aula3 = new Aula("Testando listas",10);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas.toString());
		
		Collections.sort(aulas);
		
		System.out.println(aulas.toString());
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas.toString());
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas.toString());
	}
}
