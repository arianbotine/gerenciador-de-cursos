package br.com.treinamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, String> matricula = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void adicionaAula(Aula aula) {
		this.aulas.add(aula);
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + " , tempo total: " + this.getTempoTotal() + ", aulas: " + aulas;
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matricula.put(aluno.getNumeroMatricula(), aluno.getNome());
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public boolean estaMatriculado(Aluno outroAluno) {
		return this.alunos.contains(outroAluno);
	}
	
	public String buscaMatricula(int numeroMatricula) {
		if (!this.matricula.containsKey(numeroMatricula)) {
			throw new NoSuchElementException();
		}
		return this.matricula.get(numeroMatricula);
	}

}
