package br.com.treinamento;

import java.util.Collection;
import java.util.HashSet;

public class TestaAluno {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("TESTE 1");
		
		alunos.add("TESTE 3");
		alunos.add("TESTE 4");
		alunos.add("TESTE 5");
		alunos.add("TESTE 6");
		
		System.out.println(alunos.size());
		
		alunos.add("TESTE 1");
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
