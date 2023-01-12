package br.com.treinamento;

public class TestaMatriculaAluno {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Arian Botine");

		javaColecoes.adicionaAula(new Aula("Trabalhando com coleções", 20));
		javaColecoes.adicionaAula(new Aula("Trabalhando com coleções", 15));
		javaColecoes.adicionaAula(new Aula("Trabalhando com coleções", 10));

		Aluno aluno1 = new Aluno("Rodrigo Turini", 34672);
		Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
		Aluno aluno3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricular(aluno1);
		javaColecoes.matricular(aluno2);
		javaColecoes.matricular(aluno3);
		
		System.out.println("Quem está matriculado com o número 5617");
		System.out.println(javaColecoes.buscaMatricula(5617));
	}
}
