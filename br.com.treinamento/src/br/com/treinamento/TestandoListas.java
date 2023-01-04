package br.com.treinamento;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Trabalhando com ArrayList";
		String aula2 = "Lista de objetos";
		String aula3 = "Relacionamentos com coleções";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println("toString: " + aulas.toString());

		for (String aula : aulas) {
			System.out.println("for: " + aula);
		}

		aulas.forEach(aula -> {
			System.out.println("forEach: " + aula);
		});

		// Não performático
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("for com size: " + aulas.get(i));
		}

		String primeiraAula = aulas.get(0);
		System.out.println("primeiraAula: " + primeiraAula);

		String aula4 = "Adicionando Sets";
		aulas.add(aula4);

		System.out.println("Antes do sort: " + aulas.toString());
		Collections.sort(aulas);
		System.out.println("Depois do sort: " + aulas.toString());
		
		aulas.remove(1);

		System.out.println("Lista sem a primeira posição: " + aulas.toString());

		aulas.remove(aula1);

		System.out.println("Lista sem o segundo objeto: " + aulas.toString());

	}
}
