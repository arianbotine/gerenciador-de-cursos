package br.com.treinamento;

import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Trabalhando com ArrayList";
		String aula2 = "Lista de objetos";
		String aula3 = "Relacionamentos com coleções";
		
		ArrayList<String> listaAulas = new ArrayList<>();
		
		listaAulas.add(aula1);
		listaAulas.add(aula2);
		listaAulas.add(aula3);
		
		System.out.println(listaAulas.toString());
	}
}
