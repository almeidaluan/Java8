package model;

public class Curso {

	private String nome;
	private int quantidadeAlunos;
	
	public Curso(String nome, int quantidadeAlunos) {
		this.nome = nome;
		this.quantidadeAlunos = quantidadeAlunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}
	
	
	
}
