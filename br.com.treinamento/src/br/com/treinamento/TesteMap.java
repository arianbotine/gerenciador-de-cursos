package br.com.treinamento;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		System.out.println(nomesParaIdade.keySet());
		Set<String> chaves = nomesParaIdade.keySet();
		
		for (String chave : chaves) {
			System.out.println(chave);
		}
		
		System.out.println(nomesParaIdade.values());
		Collection<Integer> valores = nomesParaIdade.values();
		
		for (Integer valor : valores) {
			System.out.println(valor);
		}
	}
}
