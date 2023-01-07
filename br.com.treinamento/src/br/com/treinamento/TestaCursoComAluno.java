package br.com.treinamento;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Arian Botine");

		javaColecoes.adicionaAula(new Aula("Trabalhando com coleções", 20));
		javaColecoes.adicionaAula(new Aula("Trabalhando com coleções", 15));
		javaColecoes.adicionaAula(new Aula("Trabalhando com coleções", 10));

		Aluno aluno1 = new Aluno("Rodrigo Turini", 34672);
		Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
		Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);
		Aluno aluno4 = new Aluno("Paulo Silveira", 5426);

		javaColecoes.matricular(aluno1);
		javaColecoes.matricular(aluno2);
		javaColecoes.matricular(aluno3);

		Set<Aluno> alunos = javaColecoes.getAlunos();
		/*
		 * alunos.add(aluno4);
		 */

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		/*
		 * Se o curso estivesse cancelado, faria sentido ter uma lista destinada a ser
		 * vazia em aulas 
		 * 
		 * Set<String> nomes = Collections.emptySet();
		 * nomes.add("Paulo");
		 */

		/*
		 * Uma das características mais interessantes de JVM é que ela sabe trabalhar em
		 * paralelo. Internamente isso é feito por meio de Threads que funcionam como
		 * pequenos processos dentro da JVM. O problema é que as coleções que estamos
		 * usando até agora não foram feitas para serem manipuladas em paralelo. No
		 * entanto, nada impede que usemos um método da classe Collections para
		 * transformar uma coleção comum em uma coleção para threads. É justamente isso
		 * que o método faz, retorna um nova coleção que pode ser compartilhada entre
		 * threads sem perigos.
		 * 
		 * Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		 */
	}
}
