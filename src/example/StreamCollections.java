package example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Curso;

public class StreamCollections {

	public static void main(String ... args) {
		
		List<Curso> listaCursos = new ArrayList<Curso>();
		
		listaCursos.add(new Curso("Programação JAVA",100));
		listaCursos.add(new Curso("Programação ELIXIR",50));
		listaCursos.add(new Curso("Golang linguagem para processamento",20));
		listaCursos.add(new Curso("Desenvolvedor FULLSTACK",500));
		
		listaCursos.sort(Comparator.comparing(Curso::getQuantidadeAlunos));

		// Listando cursos que possuem +=  50 alunos iterando ele e retornando os nomes
		List<String> cursos = listaCursos.stream()
				.filter(c -> c.getQuantidadeAlunos() >= 50)
				.map(cursosFiltrados -> {
					return cursosFiltrados.getNome();
				}).collect(Collectors.toList());

		System.out.println(cursos);

		//Pegar os cursos que possuem a quantidade de alunos >= 100 e somar para ter o total de alunos desses cursos.
		int soma = listaCursos.stream()
				.filter(c -> c.getQuantidadeAlunos() >= 100)
				.mapToInt(Curso::getQuantidadeAlunos).sum();

		System.out.println(soma);

		//Usando o ifpresent eu garanto que nao de exception
		// caso nao tenha cursos > 500 alunos ele me retorna nada
		//caso seja >= ele vai me retornar
		Optional<Curso> curso = listaCursos.stream()
				.filter(c -> c.getQuantidadeAlunos() >= 100)
				.findAny();

		curso.ifPresent(c -> System.out.println(c.getNome()));

		//Pegando uma lista de Streams e transformando em map chave valor
		Map<String, Integer> listaCursosMap = listaCursos.stream()
				.filter(c -> c.getQuantidadeAlunos() >= 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getQuantidadeAlunos()));

			System.out.println(listaCursosMap);

			//Existe tambem o parallelStream em vez de .stream
			// Ele mesmo vai decidir quantas threads usar e fazer
			//todo o trabalho consumindo cpus do pc





	}
}
