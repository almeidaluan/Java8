package example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Curso;

public class StreamCollections {

	public static void main(String ... args) {
		
		List<Curso> listaCursos = new ArrayList<Curso>();
		
		listaCursos.add(new Curso("Programação JAVA",100));
		listaCursos.add(new Curso("Programação ELIXIR",50));
		listaCursos.add(new Curso("Golang linguagem para processamento",20));
		listaCursos.add(new Curso("Desenvolvedor FULLSTACK",500));
		
		listaCursos.sort(Comparator.comparing(Curso::getQuantidadeAlunos));
		
		listaCursos.stream()
			.filter(c -> c.getQuantidadeAlunos() >= 50)
			.forEach(listaFiltrada -> System.out.println(listaFiltrada.getNome()));
			
	}
}
